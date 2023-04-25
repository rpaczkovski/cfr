package com.rvski.service.handler;

public interface EnrichmentHandler {

  void setNext(EnrichmentHandler handler);

  String handle(String response);
}

