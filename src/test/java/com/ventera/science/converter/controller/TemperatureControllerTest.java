package com.ventera.science.converter.controller;

import com.ventera.science.converter.model.StudentInputRequest;
import com.ventera.science.converter.service.TemperatureService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TemperatureControllerTest {
  @InjectMocks
  TemperatureController temperatureController;

  @Mock
  TemperatureService temperatureService;

  @Test
  public void testConvertTemperature() {
    MockHttpServletRequest request = new MockHttpServletRequest();
    RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
    double responseTemperature = 101;
    when(temperatureService.convertTemperature(any(StudentInputRequest.class))).thenReturn(responseTemperature);
    StudentInputRequest studentInputRequest = new StudentInputRequest();
    Double response = temperatureController.convertTemperature(studentInputRequest);
    assertEquals(response, responseTemperature, 0.001);
  }
}
