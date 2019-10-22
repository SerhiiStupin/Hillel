package com.java.basic.hillel.HomeWorkLecture2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MultipleChoiceTestScore {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Total tests: ");
        double a = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Tests passed");
        double p = input2.nextDouble();

        /*Scanner input3 = new Scanner(System.in);
        System.out.println("Tests failed");
        double fail = input3.nextDouble();*/

        double pass = (p * 100) / a;
        double f = ((a - p) * 100) / a;

        System.out.println("Result: Passed - " + pass + "%, Failed - " + f + "%" );

    }
}
