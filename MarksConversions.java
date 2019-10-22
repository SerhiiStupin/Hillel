package com.java.basic.hillel.HomeWorkLecture2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MarksConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total tests: ");
        double t = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the marked quantity of tests: ");
        double m = input2.nextDouble();

        System.out.println("Results: " + (100 * m) / t + "%");
    }
}
