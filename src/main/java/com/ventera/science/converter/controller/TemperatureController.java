package com.ventera.science.converter.controller;

import com.ventera.science.converter.model.StudentInputRequest;
import com.ventera.science.converter.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {
  @Autowired
  private TemperatureService temperatureService;

  @PostMapping("/convertTemperature")
  public double convertTemperature(@RequestBody final StudentInputRequest studentInputRequest) {
    return temperatureService.convertTemperature(studentInputRequest);
  }
}
