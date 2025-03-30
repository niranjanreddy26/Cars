package com.Vehicles;

public interface Vehicle extends VehicleMaintenance {
void start();
void stop();
void accelerate(int acceleration);
void decelerate(int deceleration);
int getFuelLevel();
}
