package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type in the radius of your circle.");
        double radius = input.nextDouble();
        System.out.println("Can you type in the first three digits of PI?");
        double PI = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The area of your circle is the " + radius+ "of the " + area + ". Isn't math fun?");

//        System.out.println();
    }
}