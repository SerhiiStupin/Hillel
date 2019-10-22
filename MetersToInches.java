package com.java.basic.hillel.HomeWorkLecture2;

import java.util.Scanner;

public class MetersToInches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double i = 39.37;

        System.out.println("Enter a distance in meters here: ");
        double m = input.nextDouble();
        System.out.println("The distance in Inches is: " + (m * i));

        System.out.println("Or if you want to get information in meters, enter distance in Inches here:" );
        double y = input.nextDouble();
        System.out.println("THe distance in meters is: " + (y / i));
    }
}
