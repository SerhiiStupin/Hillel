package com.java.basic.hillel.HomeWorkLecture2;

import java.util.Scanner;

public class CelsiusToKelvin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double k = 273.16;

        System.out.println("Please enter a temperature in Celsius here: ");
        double c = input.nextDouble();

        System.out.println("The result in Kelvin is: " + (c + k));
        }
}
