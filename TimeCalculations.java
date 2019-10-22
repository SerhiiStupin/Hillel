package com.java.basic.hillel.HomeWorkLecture2;

import java.util.Scanner;

public class TimeCalculations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter time in seconds here: ");
        int t = input.nextInt();

        int s = t % 60;
        int m = t / 60;
        int h = m % 60;
        m = m / 60;

        System.out.println("The time is " + m + " hours " + h + " minutes " + s + " seconds");
    }
}
