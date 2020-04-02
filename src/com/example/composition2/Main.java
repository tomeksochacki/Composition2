package com.example.composition2;

public class Main {
    public static void main(String[] args) {

        Motor motor = new Motor("Honda", 5, 150);

        Wheel wheel = new Wheel("Dębica", 18);
        Wheel wheel1 = new Wheel("Dębica", 18);
        Wheel wheel2 = new Wheel("Dębica", 18);
        Wheel wheel3 = new Wheel("Dębica", 18);

        Parking parking = new Parking("Parking za grosz", 20);

        Car car = new Car("Audi");

        car.getName();

        car.setMotor(motor);
        car.getMotor();
        motor.setWheel(new Wheel[]{wheel,wheel,wheel2,wheel3});
        motor.getWheel();
        car.setParking(parking);
        car.getParking();

        System.out.println(car);


    }
}
