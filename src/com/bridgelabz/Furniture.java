package com.bridgelabz;

public class Furniture {
//    Write a Java program to create a class called "Furniture" with instance variables "type," "material,"
//    and "price." Include a method to calculate the discount on the furniture based on its material and
//    a method to print the furniture's type, material, and discounted price.
    static String type,material;
    static int price;
    static int calculateDiscount(String material){
        if(material == "wood"){
            return price - 2350;
        }
        else if(material == "metal"){
            return price - 4350;
        }
        else{
            return price - 5500;
        }
    }
    static void display(){
        System.out.println("Furniture's type : "+type+", material : "+material+", and discounted price : "+calculateDiscount(material));
    }

    public static void main(String[] args) {
        type = "table";
        material = "metal";
        price = 60000;
        display();
    }
}
