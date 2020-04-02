package com.example.composition2;

public class Car {
    private String name;
    private Motor motor;
    private Wheel[] wheel;
    private Parking parking;

    public Car(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }
    public Motor getMotor(){
        return motor;
    }
    /**public void setWheel(Wheel[] wheel){
        this.wheel = wheel;
    }
    public Wheel[] getWheel(){
        return wheel;
    }*/
    public void setParking(Parking parking){
        this.parking = parking;
    }
    public Parking getParking(){
        return parking;
    }
    public String toString(){
        return "Name" + name + parking + wheel;
    }
}
