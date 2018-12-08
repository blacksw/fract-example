package com.company;

public class Main {

    public static void main(String[] args) {
        Owner nik = new Owner("nik",365*20,80*1000);
        Dog black = new Dog("black",1000*1,365*1.6);
         while((int)(nik.food) != 0){
            black.eat(nik.getFood(200));
             System.out.println(nik.toString());
             System.out.println(black.toString());
         }
    }
}
