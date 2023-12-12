package com.bridgelabz;

public class Phone {
    static int makeInYear;
    static int model;
    static int storageInGB;
    static int calculateCost(int makeInYear,int model,int storageInGB){
        // Storage(GB) 16 - Rs. 4000
        // model(version) 1 - Rs. 2000
        // makeInYears(Year) 2020 - Rs. 20000, 2021 - Rs. 30000
        if(makeInYear == 2020 && model == 1 && storageInGB == 16){
            return 20000 + 2000 + 4000;
        }
        else if(makeInYear == 2021 && model == 2 && storageInGB == 32){
            return 30000 + 4000 + 8000;
        }
        else {
            return 30000 + 4000 + 12000;
        }
    }
    static void display(){
        System.out.println("Make : "+makeInYear+"\nModel : "+model+"\nStorage : "+storageInGB);
    }

    public static void main(String[] args) {
        makeInYear = 2020;
        model = 1;
        storageInGB = 16;
        display();
        System.out.println("Total cost : "+calculateCost(makeInYear,model,storageInGB));
    }
}
