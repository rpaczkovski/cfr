package com.rvski.service.handler;

import com.rvski.exception.BusinessRuleException;

public abstract class AbstractEnrichmentHandler implements EnrichmentHandler {

  protected EnrichmentHandler nextHandler;

  @Override
  public void setNext(EnrichmentHandler handler) {
    this.nextHandler = handler;
  }

  @Override
  public String handle(String response) {
    try {
      response = enrich(response);
    } catch (BusinessRuleException e) {
      System.out.printf("Erro de regra de negócio: " + e.getMessage() + "\n");
    }
    if (nextHandler != null) {
      response = nextHandler.handle(response);
    }
    return response;
  }

  protected abstract String enrich(String response) throws BusinessRuleException;

}