package com.java.basic.hillel.HomeWorkLecture2;
import java.util.Scanner;

public class SpeedConverter {
    public static void main(String[] args) {

        System.out.println("Choose the desired speed parameter:");
        System.out.println("1 - Mi to Km");
        System.out.println("2 - Km to Mi");

        Scanner input = new Scanner(System.in);
        double sp = input.nextDouble();

        if (sp == 1){
            System.out.println("Enter the speed in Miles: ");
            Scanner inp = new Scanner(System.in);
            double mi = inp.nextDouble();
            System.out.println("The speed is " + mi / 0.6214 + " km/hr");
        }
        else {
            System.out.println("Enter the speed in Kilometres: ");
            Scanner input3 = new Scanner(System.in);
            double km = input3.nextDouble();
            System.out.println("The speed is " + km * 0.6214 + " mi/hr");
        }
    }
}
