package com.rvski.service.handler;

import com.rvski.exception.BusinessRuleException;
import com.rvski.service.handler.AbstractEnrichmentHandler;

public class GeocodeEnrichmentHandler extends AbstractEnrichmentHandler {

  @Override
  protected String enrich(String response) throws BusinessRuleException {
    if (geocodingFails()) {
      throw new BusinessRuleException(401, "Erro de geocode");
    }
    return response + "_geocoded";
  }

  private boolean geocodingFails() {
    return false;
  }

}

