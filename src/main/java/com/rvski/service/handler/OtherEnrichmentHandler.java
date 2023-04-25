package com.rvski.service.handler;

import com.rvski.exception.BusinessRuleException;
import com.rvski.service.handler.AbstractEnrichmentHandler;

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
