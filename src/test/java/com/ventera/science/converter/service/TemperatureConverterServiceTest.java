package com.ventera.science.converter.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TemperatureConverterServiceTest {
  @InjectMocks
  TemperatureConverterService temperatureConverterService;

  @Mock
  VolumeService volumeService;

  @Test
  public void testConvertKelvinToCelsius() {
    double kelvin = 273.15;
    double expectedCelsius = 0;
    assertEquals(temperatureConverterService.convertKelvinToCelsius(kelvin), expectedCelsius, 0.001);
  }

  @Test
  public void testConvertKelvinToFahrenheit() {
    double kelvin = 273.15;
    double expectedFahrenheit = 32;
    assertEquals(temperatureConverterService.convertKelvinToFahrenheit(kelvin), expectedFahrenheit, 0.001);
  }

  @Test
  public void testConvertKelvinToRankine() {
    double kelvin = 273.15;
    double expectedRankine = 491.67;
    assertEquals(temperatureConverterService.convertKelvinToRankine(kelvin), expectedRankine, 0.001);
  }

  @Test
  public void testConvertCelsiusToFahrenheit() {
    double celsius = 0;
    double expectedFahrenheit = 32.0;
    assertEquals(temperatureConverterService.convertCelsiusToFahrenheit(celsius), expectedFahrenheit, 0.001);
  }

  @Test
  public void testConvertCelsiusToKelvin() {
    double celsius = 0;
    double expectedKelvin = 273.15;
    assertEquals(temperatureConverterService.convertCelsiusToKelvin(celsius), expectedKelvin, 0.001);
  }

  @Test
  public void testConvertCelsiusToRankine() {
    double celsius = 0;
    double expectedRankine = 491.67;
    assertEquals(temperatureConverterService.convertCelsiusToRankine(celsius), expectedRankine, 0.001);
  }

  @Test
  public void testConvertFahrenheitToKelvin() {
    double fahrenheit = 32.0;
    double expectedKelvin = 273.15;
    assertEquals(temperatureConverterService.convertFahrenheitToKelvin(fahrenheit), expectedKelvin, 0.001);
  }

  @Test
  public void testConvertFahrenheitToCelsius() {
    double fahrenheit = 32.0;
    double expectedCelsius = 0;
    assertEquals(temperatureConverterService.convertFahrenheitToCelsius(fahrenheit), expectedCelsius, 0.001);
  }

  @Test
  public void testConvertFahrenheitToRankine() {
    double fahrenheit = 32.0;
    double expectedRankine = 491.67;
    assertEquals(temperatureConverterService.convertFahrenheitToRankine(fahrenheit), expectedRankine, 0.001);
  }

  @Test
  public void testConvertRankineToKelvin() {
    double rankine = 491.67;
    double expectedKelvin = 273.15;
    assertEquals(temperatureConverterService.convertRankineToKelvin(rankine), expectedKelvin, 0.001);
  }

  @Test
  public void testConvertRankineToCelsius() {
    double rankine = 491.67;
    double expectedCelsius = 0;
    assertEquals(temperatureConverterService.convertRankineToCelsius(rankine), expectedCelsius, 0.001);
  }

  @Test
  public void testConvertRankineToFahrenheit() {
    double rankine = 491.67;
    double expectedFahrenheit = 32.0;
    assertEquals(temperatureConverterService.convertRankineToFahrenheit(rankine), expectedFahrenheit, 0.001);
  }
}
