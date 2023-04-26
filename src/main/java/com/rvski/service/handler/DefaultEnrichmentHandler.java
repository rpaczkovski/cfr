package com.rvski.service.handler;

import com.rvski.exception.BusinessRuleException;
import org.springframework.stereotype.Component;

@Component
public class DefaultEnrichmentHandler extends AbstractEnrichmentHandler {

  @Override
  protected String enrich(String response) throws BusinessRuleException {
    if (defaultEnrichmentFails()) {
      throw new BusinessRuleException(401, "Erro no enriquecimento padrão");
    }
    return response + "_default";
  }

  private boolean defaultEnrichmentFails() {
    return false;
  }

}

