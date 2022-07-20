package com.ventera.science.converter.util;

import com.ventera.science.converter.constant.TemperatureConverterConstants;
import com.ventera.science.converter.constant.VolumeConverterConstants;
import com.ventera.science.converter.model.StudentInputRequest;

public class VolumeUtil {
  public static boolean isLitersInput(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.LITERS);
  }

  public static boolean isLitersTarget(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getTargetUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.LITERS);
  }

  public static boolean isTablespoonsInput(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.TABLESPOONS);
  }

  public static boolean isTablespoonsTarget(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getTargetUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.TABLESPOONS);
  }

  public static boolean isCubicInchesInput(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.CUBIC_INCHES);
  }

  public static boolean isCubicInchesTarget(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getTargetUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.CUBIC_INCHES);
  }

  public static boolean isCupsInput(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.CUPS);
  }

  public static boolean isCupsTarget(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getTargetUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.CUPS);
  }

  public static boolean isCubicFeetInput(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.CUBIC_FEET);
  }

  public static boolean isCubicFeetTarget(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getTargetUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.CUBIC_FEET);
  }

  public static boolean isGallonsInput(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.GALLONS);
  }

  public static boolean isGallonsTarget(StudentInputRequest studentInputRequest) {
    return studentInputRequest.getTargetUnitOfMeasure().equalsIgnoreCase(VolumeConverterConstants.GALLONS);
  }
}
