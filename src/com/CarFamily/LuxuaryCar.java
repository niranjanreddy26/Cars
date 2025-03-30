package com.CarFamily;

public class LuxuaryCar extends Car{
    private boolean stateOfVehicle=false;
    private int speed=110;
    private int fuel=100;

    public LuxuaryCar(boolean stateOfVehicle,int speed, int fuel,boolean massage){
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
            System.out.println("The speed after deceleration is "+speed+"kmph");
        }
    }

    @Override
    public void decelerate(int deceleration) {
        if(!stateOfVehicle){
            System.out.println("The speed after deceleration is "+speed+"kmph");
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
        System.out.println("Breakpad is fine for next service!");
    }
    public void enableMassage(){
        boolean massage = true;
        System.out.println("The massage is on.");
    }

    public static void main(String[] args) {
        LuxuaryCar rr = new LuxuaryCar(false,80,90,false);

        rr.start();
        rr.accelerate(10);
        rr.decelerate(10);
        System.out.println("The fuel level in the car is "+rr.getFuelLevel()+" percent");
        rr.oilChange();
        rr.batteryCheck();
        rr.tyrePressureCheck();
        rr.breakCheck();
        rr.enableMassage();
    }
}
