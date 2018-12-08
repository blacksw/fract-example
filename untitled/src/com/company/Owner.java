package com.company;

public class Owner{
    public String fullname;
    public double age;
    public double food;
    public Owner(String fullname, double age, double food){
        this.fullname = fullname;
        this.age = age;
        this.food = food;
    }
    public double getFood(double quantity){
        ++age;
        food -= quantity;
        return quantity;
    }
    public String toString(){
     return this.fullname + " (owner) " + " His Age is " + (int)(this.age/365) + " In stock " + this.food;
    }
}
