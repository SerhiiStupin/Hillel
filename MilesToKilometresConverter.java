package com.java.basic.hillel.HomeWorkLecture2;

import java.util.Scanner;

public class MilesToKilometresConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mi = 1.609;

        System.out.println("Enter a distance in km here: ");
        double km = input.nextDouble();
        System.out.println("The distance in Inches is: " + (km * mi));

        System.out.println("Or if you want to get information in miles, enter distance in km here:" );
        double km2 = input.nextDouble();
        System.out.println("THe distance in meters is: " + (km2 / mi));
    }
}
