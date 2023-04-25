package com.rvski.service;

import com.rvski.exception.BusinessRuleException;

public class OtherEnrichmentHandler extends AbstractEnrichmentHandler {

  @Override
  protected String enrich(String response) throws BusinessRuleException {
    if (otherFails()) {
      throw new BusinessRuleException(401, "Erro de other");
    }
    return response + "_other";
  }

  private boolean otherFails() {
    return true;
  }

}
