package com.example.Vehicle.entity;

import com.example.Vehicle.VehicleStatusEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "vehicle")
public class VehicleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int vehicleID;

//    @ManyToOne
    int vehicleOwnerID;

    @Column(length = 50)
    String vehicleNumberPlate;

    @Column(length = 100)
    String vehicleLocation;

    @Enumerated(EnumType.STRING)
    VehicleStatusEnum vehicleStatus;


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

    public VehicleStatusEnum getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatusEnum vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
}
