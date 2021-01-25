package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(12));
        System.out.println(area(12,3));

    }

    public static double area (double radius) {
        if (radius < -1) {
            return -1;
        }
        return radius * radius * Math.PI;
    }

        public static double area (double x,double y) {
        if ((x < -1) || (y < -1)) {
            return -1;
        }

        return x * y;

    }



}
