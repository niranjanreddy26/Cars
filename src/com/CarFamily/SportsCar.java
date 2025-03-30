package com.CarFamily;

import java.sql.SQLOutput;

public class SportsCar extends Car {
    private boolean stateOfVehicle=false;
    private int speed=110;
    private int fuel=70;
    private final int  maxSpeed=350;
    private boolean boost =false;
    public SportsCar(boolean stateOfVehicle,int speed, int fuel){
        this.stateOfVehicle=stateOfVehicle;
        this.speed=speed;
        this.fuel=fuel;
    }
    @Override
    public void start() {
        stateOfVehicle=true;
        System.out.println("The vehicle is started !");
    }

    @Override
    public void stop() {
        stateOfVehicle=false;
        System.out.println("The vehicle is is stopped!!");
    }

    @Override
    public void accelerate(int acceleration) {
        if(!stateOfVehicle){
            System.out.println("start the Vehicle to accelerate");
        }
        else{
            speed=speed+acceleration;
            System.out.println("The speed after acceleration is "+speed+"kmph");
        }
    }

    @Override
    public void decelerate(int deceleration) {
        if(!stateOfVehicle){
            System.out.println("start the Vehicle to decelerate");
        }
        else{
            speed=speed-speed*10/100;
            System.out.println("The speed after deceleration is "+speed+"kmph");
        }
    }

    @Override
    public int getFuelLevel() {
        return fuel;
    }

    @Override
    public void oilChange() {
        System.out.println("Your oil will change is in next month.");
    }

    @Override
    public void batteryCheck() {
        System.out.println("The battery is working fine.");
    }

    @Override
    public void tyrePressureCheck() {
        System.out.println("The pressure in tyres are full.");
    }

    @Override
    public void breakCheck() {
        System.out.println("Breakpad is fine for next service!");
    }
    public void enableBoost(){
        boost= true;
        System.out.println("The boost is enabled.");
    }
    public static void main(String[] args) {
        SportsCar bugatti = new SportsCar(false,100,80);
        bugatti.start();
        bugatti.accelerate(10);
        bugatti.decelerate(10);
        System.out.println("The fuel level in the car is "+bugatti.getFuelLevel()+"percent");
        bugatti.oilChange();
        bugatti.batteryCheck();
        bugatti.tyrePressureCheck();
        bugatti.breakCheck();
        bugatti.enableBoost();
    }
}
