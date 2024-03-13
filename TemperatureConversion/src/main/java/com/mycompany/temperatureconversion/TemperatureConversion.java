/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperatureconversion;

/**
 *
 * @author 111ma
 */
public class TemperatureConversion {
    public static void main(String[] args) {
        final double FAHRENHEIT = 98.6; // Example Fahrenheit temperature
        double celsius;
        
        // Convert Fahrenheit to Celsius
        celsius = (FAHRENHEIT - 32) * 5 / 9;
        
        // Print the result
        System.out.println("Temperature in Fahrenheit: " + FAHRENHEIT );
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
