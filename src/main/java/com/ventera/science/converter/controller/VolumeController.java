package com.ventera.science.converter.controller;

import com.ventera.science.converter.model.StudentInputRequest;
import com.ventera.science.converter.service.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolumeController {
  @Autowired
  private VolumeService volumeService;

  @PostMapping("/convertVolume")
  public double convertVolume(@RequestBody final StudentInputRequest studentInputRequest) {
    return volumeService.convertVolume(studentInputRequest);
  }
}
