package com.ventera.science.converter.service;

public class VolumeConverterService {
  // Liters
  public static double convertLitersToTableSpoons(double liters) { return liters*67.628045;}

  public static double convertLitersToCubicInches(double liters) {
    return liters*61.023744;
  }

  public static double convertLitersToCups(double liters) {
    return liters*4.226753;
  }

  public static double convertLitersToCubicFeet(double liters) {
    return liters*0.035315;
  }

  public static double convertLitersToGallons(double liters) {
    return liters*0.264172;
  }

  // Tablespoons
  public static double convertTableSpoonsToLiters(double tableSpoons) {
    return tableSpoons*0.014787;
  }

  public static double convertTableSpoonsToCubicInches(double tableSpoons) {
    return tableSpoons*0.902344;
  }

  public static double convertTableSpoonsToCups(double tableSpoons) {
    return tableSpoons*0.0625;
  }

  public static double convertTableSpoonsToCubicFeet(double tableSpoons) {
    return tableSpoons*0.000522;
  }

  public static double convertTableSpoonsToGallons(double tableSpoons) {
    return tableSpoons*0.003906;
  }

  // CubicInches
  public static double convertCubicInchesToLiters(double cubicInches) {
    return cubicInches*0.016387;
  }

  public static double convertCubicInchesToTableSpoons(double cubicInches) {
    return cubicInches*1.108225;
  }

  public static double convertCubicInchesToCups(double cubicInches) {
    return cubicInches*0.069264;
  }

  public static double convertCubicInchesToCubicFeet(double cubicInches) {
    return cubicInches*0.000579;
  }

  public static double convertCubicInchesToGallons(double cubicInches) {
    return cubicInches*0.004329;
  }

  // Cups
  public static double convertCupsToLiters(double cups) {
    return cups*0.236588;
  }

  public static double convertCupsToTableSpoons(double cups) {
    return cups*16;
  }

  public static double convertCupsToCubicInches(double cups) {
    return cups*14.4375;
  }

  public static double convertCupsToCubicFeet(double cups) {
    return cups*0.008355;
  }

  public static double convertCupsToGallons(double cups) {
    return cups*0.0625;
  }

  // CubicFeet
  public static double convertCubicFeetToLiters(double cubicFeet) {
    return cubicFeet*28.316847;
  }

  public static double convertCubicFeetToTableSpoons(double cubicFeet) { return cubicFeet*1915.012987;}

  public static double convertCubicFeetToCubicInches(double cubicFeet) { return cubicFeet*1728;}

  public static double convertCubicFeetToCups(double cubicFeet) {
    return cubicFeet*119.688312;
  }

  public static double convertCubicFeetToGallons(double cubicFeet) {
    return cubicFeet*7.480519;
  }

  // Gallons
  public static double convertGallonsToLiters(double gallons) {
    return gallons*3.785412;
  }

  public static double convertGallonsToTableSpoons(double gallons) { return gallons*256; }

  public static double convertGallonsToCubicInches(double gallons) {
    return gallons*231;
  }

  public static double convertGallonsToCups(double gallons) { return gallons*16; }

  public static double convertGallonsToCubicFeet(double gallons) {
    return gallons*0.133681;
  }
}
