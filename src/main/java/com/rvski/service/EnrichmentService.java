package com.rvski.service;


import com.rvski.service.handler.DefaultEnrichmentHandler;
import com.rvski.service.handler.EnrichmentHandler;
import com.rvski.service.handler.GeocodeEnrichmentHandler;
import com.rvski.service.handler.OtherEnrichmentHandler;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnrichmentService {

  private final DefaultEnrichmentHandler defaultHandler;
  private final OtherEnrichmentHandler otherHandler;
  private final GeocodeEnrichmentHandler geocodeHandler;

  private EnrichmentHandler enrichmentHandler;

  @PostConstruct
  public void init() {
    this.enrichmentHandler = defaultHandler;
    this.enrichmentHandler.addNext(otherHandler);
    this.enrichmentHandler.addNext(geocodeHandler);
  }

  public String enrich(String response) {
    response = enrichmentHandler.handle(response);
    return response;
  }
}


