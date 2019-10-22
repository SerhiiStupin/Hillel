package com.java.basic.hillel.HomeWorkLecture2;

import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long f = 32;
        long a = 5;
        long b = 9;

        System.out.println("Enter a temperature in Fahrenheits");
        long c = input.nextLong();
        System.out.println("The temperature in Celsius is : " + ((a/b)*(c-f)));

        System.out.println("Enter a temperature in Celsius");
        long d = input.nextLong();
        System.out.println("The temperature in Fahrenheits is : " + ((a/b)*(d+f)));
    }
}
