package com.ventera.science.converter.controller;

import com.ventera.science.converter.model.StudentInputRequest;
import com.ventera.science.converter.service.VolumeService;
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
public class VolumeControllerTest {
  @InjectMocks
  VolumeController volumeController;

  @Mock
  VolumeService volumeService;

  @Test
  public void testConvertVolume() {
    MockHttpServletRequest request = new MockHttpServletRequest();
    RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
    double responseVolume = 102;
    when(volumeService.convertVolume(any(StudentInputRequest.class))).thenReturn(responseVolume);
    StudentInputRequest studentInputRequest = new StudentInputRequest();
    Double response = volumeController.convertVolume(studentInputRequest);
    assertEquals(response, responseVolume, 0.001);
  }
}
