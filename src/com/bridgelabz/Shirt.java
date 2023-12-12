package com.bridgelabz;

public class Shirt {
//    Write a Java program to create a class called "Shirt" with instance variables "size," "color," and "price."
//    Include a method to calculate the discount on the shirt with instance variables "size," "color," and "price."
//    Include a method to calculate the discount on the shirt based on  its size and a method to print the shirt's size,
//    color, and discounted price
    static String size, color;
    static int price;
    static int discountedPrice(String size){
        if(size == "S"){
            return price + 500;
        }
        else if(size == "M"){
            return price + 1000;
        }
        else if(size == "L"){
            return price + 1500;
        }
        else if(size == "XL"){
            return price + 2000;
        }
        else{
            //2XL
            return price + 2500;
        }
    }
    static void display(){
        System.out.println("shirt's size : "+size+", color : "+color+", and discounted price : "+discountedPrice(size));
    }

    public static void main(String[] args) {
        size = "XL";
        color = "Red";
        price = 900;
        display();
    }
}
