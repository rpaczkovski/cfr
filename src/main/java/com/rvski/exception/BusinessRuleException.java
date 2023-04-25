package com.rvski.exception;

public class BusinessRuleException extends RuntimeException {

  private int errorCode;

  public BusinessRuleException(int errorCode, String message) {
    super(message);
    this.errorCode = errorCode;
  }

  public int getErrorCode() {
    return errorCode;
  }

}
