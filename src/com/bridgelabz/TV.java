package com.bridgelabz;

public class TV {
//    Write a Java program to create a class called "TV" with instance variables "brand," "size," and "price."
//    Include a method to calculate the discount on the TV based on its size and a method to print
//    the TV's brand, size, and discounted price.
    static String brand;
    static int size,price,discountedPrice;
    static int calculateDiscount(int size, int price){
        if(size == 32){
            return price - 1500;
        }
        else {
            return price - 3000;
        }
    }
    static void display(){
        System.out.println("TV's brand : "+brand+", size : "+size+", and discounted price : "+discountedPrice);
    }

    public static void main(String[] args) {
        brand = "Oneplus";
        size = 32;
        price = 50000;
        discountedPrice = calculateDiscount(size, price);
        display();
    }
}
