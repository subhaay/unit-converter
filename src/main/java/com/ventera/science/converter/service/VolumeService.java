package com.ventera.science.converter.service;

import com.ventera.science.converter.model.StudentInputRequest;
import com.ventera.science.converter.util.VolumeUtil;
import org.springframework.stereotype.Service;

@Service
public class VolumeService {
  public double convertVolume(StudentInputRequest studentInputRequest) {
    if(studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(studentInputRequest.getTargetUnitOfMeasure())){
      return studentInputRequest.getInputNumericalValue();
    }
    // Liters
    if (VolumeUtil.isLitersInput(studentInputRequest) && VolumeUtil.isTablespoonsTarget(studentInputRequest)) {
      return VolumeConverterService.convertLitersToTableSpoons(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isLitersInput(studentInputRequest) && VolumeUtil.isCubicInchesTarget(studentInputRequest)) {
      return VolumeConverterService.convertLitersToCubicInches(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isLitersInput(studentInputRequest) && VolumeUtil.isCupsTarget(studentInputRequest)) {
      return VolumeConverterService.convertLitersToCups(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isLitersInput(studentInputRequest) && VolumeUtil.isCubicFeetTarget(studentInputRequest)) {
      return VolumeConverterService.convertLitersToCubicFeet(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isLitersInput(studentInputRequest) && VolumeUtil.isGallonsTarget(studentInputRequest)) {
      return VolumeConverterService.convertLitersToGallons(studentInputRequest.getInputNumericalValue());
    // Tablespoons
    } else if (VolumeUtil.isTablespoonsInput(studentInputRequest) && VolumeUtil.isLitersTarget(studentInputRequest)) {
      return VolumeConverterService.convertTableSpoonsToLiters(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isTablespoonsInput(studentInputRequest) && VolumeUtil.isCubicInchesTarget(studentInputRequest)) {
      return VolumeConverterService.convertTableSpoonsToCubicInches(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isTablespoonsInput(studentInputRequest) && VolumeUtil.isCupsTarget(studentInputRequest)) {
      return VolumeConverterService.convertTableSpoonsToCups(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isTablespoonsInput(studentInputRequest) && VolumeUtil.isCubicFeetTarget(studentInputRequest)) {
      return VolumeConverterService.convertTableSpoonsToCubicFeet(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isTablespoonsInput(studentInputRequest) && VolumeUtil.isGallonsTarget(studentInputRequest)) {
      return VolumeConverterService.convertTableSpoonsToGallons(studentInputRequest.getInputNumericalValue());
    // CubicInches
    } else if (VolumeUtil.isCubicInchesInput(studentInputRequest) && VolumeUtil.isLitersTarget(studentInputRequest)) {
      return VolumeConverterService.convertCubicInchesToLiters(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCubicInchesInput(studentInputRequest) && VolumeUtil.isTablespoonsTarget(studentInputRequest)) {
      return VolumeConverterService.convertCubicInchesToTableSpoons(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCubicInchesInput(studentInputRequest) && VolumeUtil.isCupsTarget(studentInputRequest)) {
      return VolumeConverterService.convertCubicInchesToCups(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCubicInchesInput(studentInputRequest) && VolumeUtil.isCubicFeetTarget(studentInputRequest)) {
      return VolumeConverterService.convertCubicInchesToCubicFeet(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCubicInchesInput(studentInputRequest) && VolumeUtil.isGallonsTarget(studentInputRequest)) {
      return VolumeConverterService.convertCubicInchesToGallons(studentInputRequest.getInputNumericalValue());
    // Cups
    } else if (VolumeUtil.isCupsInput(studentInputRequest) && VolumeUtil.isLitersTarget(studentInputRequest)) {
      return VolumeConverterService.convertCupsToLiters(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCupsInput(studentInputRequest) && VolumeUtil.isTablespoonsTarget(studentInputRequest)) {
      return VolumeConverterService.convertCupsToTableSpoons(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCupsInput(studentInputRequest) && VolumeUtil.isCubicInchesTarget(studentInputRequest)) {
      return VolumeConverterService.convertCupsToCubicInches(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCupsInput(studentInputRequest) && VolumeUtil.isCubicFeetTarget(studentInputRequest)) {
      return VolumeConverterService.convertCupsToCubicFeet(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCupsInput(studentInputRequest) && VolumeUtil.isGallonsTarget(studentInputRequest)) {
      return VolumeConverterService.convertCupsToGallons(studentInputRequest.getInputNumericalValue());
    // CubicFeet
    } else if (VolumeUtil.isCubicFeetInput(studentInputRequest) && VolumeUtil.isLitersTarget(studentInputRequest)) {
      return VolumeConverterService.convertCubicFeetToLiters(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCubicFeetInput(studentInputRequest) && VolumeUtil.isTablespoonsTarget(studentInputRequest)) {
      return VolumeConverterService.convertCubicFeetToTableSpoons(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCubicFeetInput(studentInputRequest) && VolumeUtil.isCubicInchesTarget(studentInputRequest)) {
      return VolumeConverterService.convertCubicFeetToCubicInches(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCubicFeetInput(studentInputRequest) && VolumeUtil.isCupsTarget(studentInputRequest)) {
      return VolumeConverterService.convertCubicFeetToCups(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isCubicFeetInput(studentInputRequest) && VolumeUtil.isGallonsTarget(studentInputRequest)) {
      return VolumeConverterService.convertCubicFeetToGallons(studentInputRequest.getInputNumericalValue());
    // Gallons
    } else if (VolumeUtil.isGallonsInput(studentInputRequest) && VolumeUtil.isLitersTarget(studentInputRequest)) {
      return VolumeConverterService.convertGallonsToLiters(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isGallonsInput(studentInputRequest) && VolumeUtil.isTablespoonsTarget(studentInputRequest)) {
      return VolumeConverterService.convertGallonsToTableSpoons(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isGallonsInput(studentInputRequest) && VolumeUtil.isCubicInchesTarget(studentInputRequest)) {
      return VolumeConverterService.convertGallonsToCubicInches(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isGallonsInput(studentInputRequest) && VolumeUtil.isCupsTarget(studentInputRequest)) {
      return VolumeConverterService.convertGallonsToCups(studentInputRequest.getInputNumericalValue());
    } else if (VolumeUtil.isGallonsInput(studentInputRequest) && VolumeUtil.isCubicFeetTarget(studentInputRequest)) {
      return VolumeConverterService.convertGallonsToCubicFeet(studentInputRequest.getInputNumericalValue());
    }

    return -1;
  }
}
