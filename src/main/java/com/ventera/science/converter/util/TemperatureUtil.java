package com.ventera.science.converter.util;

import com.ventera.science.converter.constant.TemperatureConverterConstants;
import com.ventera.science.converter.model.StudentInputRequest;

public class TemperatureUtil {
  public static boolean isKelvinInput(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(TemperatureConverterConstants.KELVIN);
  }

  public static boolean isKelvinTarget(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getTargetUnitOfMeasure().equalsIgnoreCase(TemperatureConverterConstants.KELVIN);
  }

  public static boolean isCelsiusInput(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(TemperatureConverterConstants.CELSIUS);
  }

  public static boolean isCelsiusTarget(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getTargetUnitOfMeasure().equalsIgnoreCase(TemperatureConverterConstants.CELSIUS);
  }

  public static boolean isFahrenheitInput(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(TemperatureConverterConstants.FAHRENHEIT);
  }

  public static boolean isFahrenheitTarget(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getTargetUnitOfMeasure().equalsIgnoreCase(TemperatureConverterConstants.FAHRENHEIT);
  }

  public static boolean isRankineInput(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(TemperatureConverterConstants.RANKINE);
  }

  public static boolean isRankineTarget(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getTargetUnitOfMeasure().equalsIgnoreCase(TemperatureConverterConstants.RANKINE);
  }
}
