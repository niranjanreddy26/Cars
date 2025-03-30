package com.CarFamily;

import com.sun.security.jgss.GSSUtil;

public class SUV extends Car{
    private boolean stateOfVehicle=false;
    private int speed=110;
    private int fuel=70;
    private boolean offroadCapable = true;
    private int lowCapacity = 2;
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
            System.out.println("The speed after acceleration is "+speed);
        }
    }

    @Override
    public void decelerate(int deceleration) {
        if(!stateOfVehicle){
            System.out.println("start the Vehicle to decelerate");
        }
        else{
            speed=speed-speed*10/100;
            System.out.println("The speed after deceleration is "+speed);
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
        System.out.println("Breakpad's need to change in next service!");
    }
    public void offroad(){
        System.out.println("The Offroad mode is on");
    }

    public static void main(String[] args) {
        SUV fortuner = new SUV();
        fortuner.start();
        fortuner.accelerate(10);
        fortuner.decelerate(10);
        System.out.println("The fuel level is "+fortuner.getFuelLevel());
        fortuner.oilChange();
        fortuner.batteryCheck();
        fortuner.tyrePressureCheck();
        fortuner.breakCheck();
        fortuner.offroad();
    }
}
