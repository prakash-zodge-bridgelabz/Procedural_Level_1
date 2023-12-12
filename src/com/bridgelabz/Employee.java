package com.bridgelabz;

public class Employee {
    static String name = "Prakash";
    static int salary = 30000;
    static int id = 12176;
    static int calYearlySal(){
        return salary * 12;
    }
    static void displayNameAndSalary(){
        System.out.println("Name : "+name+"\nSalary : "+salary);
    }
    public static void main(String[] args) {
        calYearlySal();
        displayNameAndSalary();
    }
}
