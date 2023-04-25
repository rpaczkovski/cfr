package com.rvski.service;

import com.rvski.exception.BusinessRuleException;

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

