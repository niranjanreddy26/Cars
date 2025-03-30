package com.CarFamily;

public class EletricCar extends Car{

    private boolean stateOfVehicle=false;
    private int speed=110;
    private int batteryLevel =100;
    private boolean chargingState=false;
    public EletricCar(boolean stateOfVehicle, int speed,int batteryLevel,boolean chargingState){
        this.stateOfVehicle=stateOfVehicle;
        this.speed=speed;
        this.batteryLevel=batteryLevel;
        this.chargingState=chargingState;
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
        return 0;
    }

    public boolean isChargingState() {
        return chargingState;
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
    public static void main(String[] args) {
        EletricCar hummer= new EletricCar(false,100,90,false);
        hummer.start();
        hummer.accelerate(10);
        hummer.decelerate(10);
        System.out.println("The fuel level in the car is "+hummer.getFuelLevel()+" percent");
        hummer.oilChange();
        hummer.batteryCheck();
        hummer.tyrePressureCheck();
        hummer.breakCheck();
        System.out.println("The battery level is  "+hummer.getBatteryLevel());
    }
}
