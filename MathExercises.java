package com.java.basic.hillel.HomeWorkLecture2;

public class MathExercises {
    public static void main(String[] args) {
        double x2 = 10;
        double e = 2;
        double result10 = Math.abs(1.0 / 3.0 * Math.abs(Math.pow(Math.sin(x2),3) * Math.sqrt(Math.pow(e, x2*0.12))));
        System.out.println(result10);

        double x3 = 25;
        double result11 = 2*Math.PI*x3 - Math.abs(Math.sin(Math.sqrt(10.5 * x3))) * (1 / ((Math.sqrt(3))*Math.sqrt(2 * x3)) + (1/7));
        System.out.println(result11);

        double x4 = 1.5;
        double result12 = Math.log((Math.sqrt(Math.abs(2 - x4))) + 1.2) * (1 / (2 + Math.pow(e, x4))) + (Math.sqrt(3) * (2 / 3));
        System.out.println(result12);

        double x5 = 8;
        double e2 = 0.5;
        double result13 = Math.sqrt(5) * (Math.pow(e2, (-2 + x5)) * (1 / (Math.sqrt(x5) + Math.pow(x5, 4) + Math.log(Math.abs(x5 - (Math.PI))))));
        System.out.println(result13);

        double i = 23;
        double y = 4;
        double result14 = (Math.sqrt((Math.sin(Math.pow(i, 3)) * (i / 2))) + ((Math.sqrt(3) * Math.pow(y, (1.3 * i)) + Math.pow(y, (-1.3 * i)))) * (1 / Math.abs(i + (5/2))));
        System.out.println(result14);
    }

}
