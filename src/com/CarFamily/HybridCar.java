package com.CarFamily;

public class HybridCar extends Car{
    private boolean stateOfVehicle=false;
    private int speed =80;
    private int fuel = 80;
    private int batteryLevel = 50;
    private boolean powerSourceFromBattery=false;
    public HybridCar(boolean stateOfVehicle,int speed,int fuel,int batteryLevel){
        this.stateOfVehicle=stateOfVehicle;
        this.speed=speed;
        this.fuel=fuel;
        this.batteryLevel=batteryLevel;
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
    public int getBatteryLevel(){
        return batteryLevel;
    }
public boolean switchPowerSource(boolean powerSourceFromBattery){
        if(powerSourceFromBattery){
            powerSourceFromBattery=false;
        }
        else{
            powerSourceFromBattery=true;
        }
        return powerSourceFromBattery;
}
    public static void main(String[] args) {
        HybridCar hycross =new HybridCar(false, 90,85,45);
        hycross.start();
        hycross.accelerate(10);
        hycross.decelerate(10);
        System.out.println("The fuel level in the car is "+hycross.getFuelLevel()+" percent");
        hycross.oilChange();
        hycross.batteryCheck();
        hycross.tyrePressureCheck();
        hycross.breakCheck();
        System.out.println("The battery level is  "+hycross.getBatteryLevel());
    }
}
