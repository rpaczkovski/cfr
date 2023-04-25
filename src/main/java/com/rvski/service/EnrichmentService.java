package com.rvski.service;


import com.rvski.service.handler.DefaultEnrichmentHandler;
import com.rvski.service.handler.EnrichmentHandler;
import com.rvski.service.handler.GeocodeEnrichmentHandler;
import com.rvski.service.handler.OtherEnrichmentHandler;

public class EnrichmentService {

  private EnrichmentHandler enrichmentHandler;

  public EnrichmentService() {
    this.enrichmentHandler = new DefaultEnrichmentHandler();
    this.enrichmentHandler.setNext(new GeocodeEnrichmentHandler());
    this.enrichmentHandler.setNext(new OtherEnrichmentHandler());
  }

  public String enrich(String response) {
    response = enrichmentHandler.handle(response);
    return response;
  }
}

