package com.ventera.science.converter.model;

import lombok.Data;

@Data
public class StudentInputRequest {
  private long inputNumericalValue;
  private String inputUnitOfMeasure;
  private String targetUnitOfMeasure;
}
