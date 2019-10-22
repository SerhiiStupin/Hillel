package com.java.basic.hillel.HomeWorkLecture2;

import java.util.Scanner;

public class KgToPundsConverter {
        public static void main(String[] args) {
            System.out.println("Please choose a weight: 1 - PoundsToKilos or 2 - KilosToPounds: ");
            Scanner input = new Scanner(System.in);
            int in = input.nextInt();

            if (in == 1)
            {
                System.out.println("Enter a number in pounds: ");
                Scanner input2 = new Scanner(System.in);
                double p = input2.nextDouble();
                System.out.println("The weight in kilos is: " + (p / 2.2046));
            }
            else {
                System.out.println("Enter a number in kilos: ");
                Scanner input3 = new Scanner(System.in);
                double k = input3.nextDouble();
                System.out.println("The weight in pounds is: " + (k * 2.2046));
            }
        }
    }