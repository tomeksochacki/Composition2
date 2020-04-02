package com.example.composition2;

import java.util.Arrays;

public class Motor {
    private String name;
    private int capacity;
    private int power;
    private Wheel [] wheel;

    public Motor(String name, int capacity, int power){
        this.name = name;
        this.capacity = capacity;
        this.power = power;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setPower(int power){
        this.power = power;
    }
    public void setWheel(Wheel[] wheel){
        this.wheel = wheel;
    }
    public Wheel[] getWheel(){
        return wheel;
    }
    public String toString(){
        return "Motor" + name + ", wheels" + Arrays.toString(wheel);
    }
}

