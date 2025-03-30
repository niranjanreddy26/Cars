package com.CarFamily;

public class Sedan extends Car{
    private int trunkSize=50;
    private int seatCapacity=5;
    private boolean stateOfVehicle=false;
    private int speed=100;
    private int fuel=60;


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
            System.out.println("The speed after acceleration is "+speed+"kmph");
        }
        else{
            speed=speed+acceleration;
            System.out.println(speed);
        }
    }

    @Override
    public void decelerate(int deceleration) {
        if(!stateOfVehicle){
            System.out.println("The speed after deceleration is "+speed+"kmph");
        }
        else{
            speed=speed-speed*10/100;
            System.out.println(speed);
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
    public  void honk(){
        System.out.println("Honk Honk!");
    }
    public void loadCargo(){
        System.out.println("The Cargo is loaded into the car with trunk capacity of "+trunkSize+" percent and seat capacity of "+ seatCapacity);
    }
    public static void main(String[] args) {
        Sedan ciaz = new Sedan();
        ciaz.start();
        ciaz.accelerate(10);
        ciaz.decelerate(10);
        System.out.println(ciaz.getFuelLevel());
        ciaz.oilChange();
        ciaz.batteryCheck();
        ciaz.tyrePressureCheck();
        ciaz.breakCheck();
        ciaz.honk();
        ciaz.loadCargo();
    }
}
