package com.rvski.service.handler;

public interface EnrichmentHandler {

  void addNext(EnrichmentHandler handler);

  String handle(String response);
}

