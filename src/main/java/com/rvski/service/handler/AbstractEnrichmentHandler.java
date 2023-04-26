package com.rvski.service.handler;


import com.rvski.exception.BusinessRuleException;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractEnrichmentHandler implements EnrichmentHandler {

  protected List<EnrichmentHandler> nextHandlers = new ArrayList<>();

  @Override
  public void addNext(EnrichmentHandler handler) {
    nextHandlers.add(handler);
  }

  @Override
  public String handle(String response) {
    try {
      response = enrich(response);
    } catch (BusinessRuleException e) {
      log.error("Erro ao enriquecer a resposta: {}", e.getMessage());
    }
    for (EnrichmentHandler handler : nextHandlers) {
      response = handler.handle(response);
    }
    return response;
  }

  protected abstract String enrich(String response) throws BusinessRuleException;

}
