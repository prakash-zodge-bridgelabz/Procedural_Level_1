package com.bridgelabz;

public class Computer {
//    Write a Java program to create a class called "Computer" with instance variables "processor," "RAM," and "storage."
//    Include a method to calculate the price of the computer based on the processor, RAM, and storage capacity and a
//    method to print the computer's processor, RAM, and storage capacity.
    static String processor;
    static int RAM, storage,price;
    static int calculatePrice(String processor, int RAM, int storage){
        if(processor == "i5" && RAM ==8 && storage == 512){
            return 45000;
        }
        else if(processor == "i10" && RAM ==16 && storage == 1024){
            return 80000;
        }
        else {
            return 95000;
        }
    }
    static void display(){
        price = calculatePrice(processor, RAM, storage);
        System.out.println("Computer's processor : "+processor+", RAM : "+RAM+", and storage capacity : "+storage+"\nPrice : "+price);

    }

    public static void main(String[] args) {
        processor = "i10";
        RAM = 16;
        storage = 1024;
        display();
    }
}
