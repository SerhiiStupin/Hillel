package com.java.basic.hillel.HomeWorkLecture2;

import java.util.Scanner;

public class TimeCalculations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter time in seconds: ");
        int time = input.nextInt();

        int s = time % 60;
        int m = time / 60;
        int h = m % 60;
        m = m / 60;

        System.out.println("The time is " + m + " hours " + h + " minutes " + s + " seconds");
    }
}
