package com.rvski.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {

  @JsonProperty("location")
  private String location;

  public Request() {
  }

  public Request(String location) {
    this.location = location;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}