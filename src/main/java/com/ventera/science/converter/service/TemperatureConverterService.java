package com.ventera.science.converter.service;

public class TemperatureConverterService {
  public static double convertKelvinToCelsius(double kelvin) { return kelvin-273.15; }

  public static double convertKelvinToFahrenheit(double kelvin) { return (kelvin*1.8)-459.67; }

  public static double convertKelvinToRankine(double kelvin) { return kelvin*1.8; }

  public static double convertCelsiusToFahrenheit(double celsius) {
    return celsius*1.8+32.0;
  }

  public static double convertCelsiusToKelvin(double celsius) {
    return celsius+273.15;
  }

  public static double convertCelsiusToRankine(double celsius) {
    return (celsius+273.15)*1.8;
  }

  public static double convertFahrenheitToKelvin(double fahrenheit) { return (fahrenheit+459.67)/1.8; }

  public static double convertFahrenheitToCelsius(double fahrenheit) { return (fahrenheit-32)/1.8; }

  public static double convertFahrenheitToRankine(double fahrenheit) { return fahrenheit+459.67; }

  public static double convertRankineToKelvin(double rankine) { return rankine/1.8; }

  public static double convertRankineToCelsius(double rankine) { return (rankine-491.67)/1.8; }

  public static double convertRankineToFahrenheit(double rankine) { return rankine-459.67; }
}

