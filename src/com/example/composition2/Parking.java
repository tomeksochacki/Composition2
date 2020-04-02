package com.example.composition2;

public class Parking {
    private String name;
    private int number;


    public Parking(String name, int number){
        this.name = name;
        this.number = number;

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    /**public void setCar(Car car){
        this.car = car;
    }
    public Car getCar(){
        return car;
    }*/
    public String toString(){
        return name;
    }

}
