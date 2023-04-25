package com.rvski;

import com.rvski.service.EnrichmentService;

public class Main {

  public static void main(String[] args) {
    EnrichmentService enrichmentService = new EnrichmentService();
    String location = "location";

    String result = enrichmentService.enrich(location);

    System.out.println(result);
  }
}