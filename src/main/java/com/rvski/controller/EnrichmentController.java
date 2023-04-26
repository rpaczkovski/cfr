package com.rvski.controller;

import com.rvski.dto.Request;
import com.rvski.service.EnrichmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrichmentController {

  @Autowired
  private EnrichmentService enrichmentService;

  @PostMapping("/enrich")
  public ResponseEntity<String> enrich(@RequestBody Request request) {
    String response = enrichmentService.enrich(request.getLocation());
    return ResponseEntity.ok(response);
  }
}
