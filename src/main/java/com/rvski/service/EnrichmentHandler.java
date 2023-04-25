package com.rvski.service;

public interface EnrichmentHandler {

  void setNext(EnrichmentHandler handler);

  String handle(String response);
}

