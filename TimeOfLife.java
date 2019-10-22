package com.java.basic.hillel.HomeWorkLecture2;

import java.util.Calendar;
import java.util.Scanner;

public class TimeOfLife {
    public static void main(String[] args) {
        int y = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Enter the year of birth: ");
        Scanner input = new Scanner(System.in);
        int yb = (y - input.nextInt());

        int m = Calendar.getInstance().get(Calendar.MONTH);
        System.out.println("Enter the month of birth: ");
        Scanner input2 = new Scanner(System.in);
        int mon = (m + 1) - input2.nextInt();


        int d = Calendar.getInstance().get(Calendar.DATE);;
        System.out.println("Enter the day of birth: ");
        Scanner input3 = new Scanner(System.in);
        int db = (d - input.nextInt());

        System.out.println("You live: " + yb + " years " + mon + " month " + db + " days");
        System.out.println(" ");

        int month = yb * 12 + mon;
        int weeks = (yb * 52) + ((mon*30+db)/7);
        int days = yb * 365 + ((mon*30)+db);
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;

        System.out.println("Or: " + yb + " years, " + month + " month, " + weeks + " weeks, " + days + " days, " +
                hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
