package com.bridgelabz;

public class Circle {
    static float radius;
    static void areaOfCircle(){
        System.out.println("Area of Circle : "+(3.14 * radius * radius));
    }
    static void areaOfCircumference(){
        System.out.println("Area of Circumference : "+(2 * 3.14 * radius));
    }
    public static void main(String[] args) {
        radius = 5;
        areaOfCircle();
        areaOfCircumference();
    }
}
