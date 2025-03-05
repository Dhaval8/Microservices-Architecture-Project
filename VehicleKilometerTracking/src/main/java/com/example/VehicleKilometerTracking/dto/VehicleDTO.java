package com.example.VehicleKilometerTracking.dto;

public class VehicleDTO {
    int vehicleID;

    int vehicleOwnerID;

    String vehicleNumberPlate;

    String vehicleLocation;

    public VehicleDTO(int vehicleID, int vehicleOwnerID, String vehicleNumberPlate, String vehicleLocation) {
        this.vehicleID = vehicleID;
        this.vehicleOwnerID = vehicleOwnerID;
        this.vehicleNumberPlate = vehicleNumberPlate;
        this.vehicleLocation = vehicleLocation;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getVehicleOwnerID() {
        return vehicleOwnerID;
    }

    public void setVehicleOwnerID(int vehicleOwnerID) {
        this.vehicleOwnerID = vehicleOwnerID;
    }

    public String getVehicleNumberPlate() {
        return vehicleNumberPlate;
    }

    public void setVehicleNumberPlate(String vehicleNumberPlate) {
        this.vehicleNumberPlate = vehicleNumberPlate;
    }

    public String getVehicleLocation() {
        return vehicleLocation;
    }

    public void setVehicleLocation(String vehicleLocation) {
        this.vehicleLocation = vehicleLocation;
    }
}
