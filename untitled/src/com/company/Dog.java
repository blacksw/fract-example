package com.company;

public class Dog{
public String name;
public double weight;
public double age;
    public Dog(String name, double weight, double age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void eat(double quantity){
        ++age;
       weight += (quantity*1)/100;
    }
    public String toString(){
        return this.name + " (Dog" + " Weight " + (this.weight/1000)+ " Age " + (int)(this.age/365);
    }
}
