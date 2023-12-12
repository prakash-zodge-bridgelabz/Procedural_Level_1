package com.bridgelabz;

public class Dog {
    static String breed;
    static int age;
    static int humanAge;
    static float weight;
    static int calculateHumanAge(int age){
        if(age <= 2){
            //For the first two years, each dog year is equivalent to 10.5 human years
            return (int)(age * 10.5);
        }
        else{
            // After the first two years, dog year is equivalent to 4 human years
            return 2 * 10 + (age - 2) * 4;
        }
    }
    static void details(){
        System.out.println("Breed : "+breed+"\nAge : "+age+"\nWeight : "+weight);
    }
    public static void main(String[] args) {
        age = 2;
        breed = "Bulldog";
        weight = 2.5f;
        humanAge = calculateHumanAge(age);
        System.out.println("Dog's human age : "+humanAge);
        details();
    }
}
