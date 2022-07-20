package com.ventera.science.converter.service;

import com.ventera.science.converter.model.StudentInputRequest;
import com.ventera.science.converter.util.TemperatureUtil;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService {
  public double convertTemperature(StudentInputRequest studentInputRequest) {
    if(studentInputRequest.getInputUnitOfMeasure().equalsIgnoreCase(studentInputRequest.getTargetUnitOfMeasure())){
      return studentInputRequest.getInputNumericalValue();
    }

    if (TemperatureUtil.isKelvinInput(studentInputRequest) && TemperatureUtil.isCelsiusTarget(studentInputRequest)) {
      return TemperatureConverterService.convertKelvinToCelsius(studentInputRequest.getInputNumericalValue());
    } else if (TemperatureUtil.isKelvinInput(studentInputRequest) && TemperatureUtil.isFahrenheitTarget(studentInputRequest)) {
      return TemperatureConverterService.convertKelvinToFahrenheit(studentInputRequest.getInputNumericalValue());
    } else if (TemperatureUtil.isKelvinInput(studentInputRequest) && TemperatureUtil.isRankineTarget(studentInputRequest)) {
      return TemperatureConverterService.convertKelvinToRankine(studentInputRequest.getInputNumericalValue());
    } else if (TemperatureUtil.isCelsiusInput(studentInputRequest) && TemperatureUtil.isFahrenheitTarget(studentInputRequest)) {
      return TemperatureConverterService.convertCelsiusToFahrenheit(studentInputRequest.getInputNumericalValue());
    } else if (TemperatureUtil.isCelsiusInput(studentInputRequest) && TemperatureUtil.isKelvinTarget(studentInputRequest)) {
      return TemperatureConverterService.convertCelsiusToKelvin(studentInputRequest.getInputNumericalValue());
    } else if (TemperatureUtil.isCelsiusInput(studentInputRequest) && TemperatureUtil.isRankineTarget(studentInputRequest)) {
      return TemperatureConverterService.convertCelsiusToRankine(studentInputRequest.getInputNumericalValue());
    } else if (TemperatureUtil.isFahrenheitInput(studentInputRequest) && TemperatureUtil.isKelvinTarget(studentInputRequest)) {
      return TemperatureConverterService.convertFahrenheitToKelvin(studentInputRequest.getInputNumericalValue());
    } else if (TemperatureUtil.isFahrenheitInput(studentInputRequest) && TemperatureUtil.isCelsiusTarget(studentInputRequest)) {
      return TemperatureConverterService.convertFahrenheitToCelsius(studentInputRequest.getInputNumericalValue());
    } else if (TemperatureUtil.isFahrenheitInput(studentInputRequest) && TemperatureUtil.isRankineTarget(studentInputRequest)) {
      return TemperatureConverterService.convertFahrenheitToRankine(studentInputRequest.getInputNumericalValue());
    } else if (TemperatureUtil.isRankineInput(studentInputRequest) && TemperatureUtil.isKelvinTarget(studentInputRequest)) {
      return TemperatureConverterService.convertRankineToKelvin(studentInputRequest.getInputNumericalValue());
    } else if (TemperatureUtil.isRankineInput(studentInputRequest) && TemperatureUtil.isCelsiusTarget(studentInputRequest)) {
      return TemperatureConverterService.convertRankineToCelsius(studentInputRequest.getInputNumericalValue());
    } else if (TemperatureUtil.isRankineInput(studentInputRequest) && TemperatureUtil.isFahrenheitTarget(studentInputRequest)) {
      return TemperatureConverterService.convertRankineToFahrenheit(studentInputRequest.getInputNumericalValue());
    }
    return -1.0;
  }
}
