package com.example.VehicleKilometerTracking.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Date;

@Entity
@Table(name = "vehicle_kilometer_tracking")
public class VehicleKilometerTracking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int vehicleKilometerTrackingID;

    int vehicleKilometerVehicleID;

    double vehicleKilometerTotalKilometers;

    Date vehicleKilometerLastUpdated;

    public int getVehicleKilometerTrackingID() {
        return vehicleKilometerTrackingID;
    }

    public void setVehicleKilometerTrackingID(int vehicleKilometerTrackingID) {
        this.vehicleKilometerTrackingID = vehicleKilometerTrackingID;
    }

    public int getVehicleKilometerVehicleID() {
        return vehicleKilometerVehicleID;
    }

    public void setVehicleKilometerVehicleID(int vehicleKilometerVehicleID) {
        this.vehicleKilometerVehicleID = vehicleKilometerVehicleID;
    }

    public double getVehicleKilometerTotalKilometers() {
        return vehicleKilometerTotalKilometers;
    }

    public void setVehicleKilometerTotalKilometers(double vehicleKilometerTotalKilometers) {
        this.vehicleKilometerTotalKilometers = vehicleKilometerTotalKilometers;
    }

    public Date getVehicleKilometerLastUpdated() {
        return vehicleKilometerLastUpdated;
    }

    public void setVehicleKilometerLastUpdated(Date vehicleKilometerLastUpdated) {
        this.vehicleKilometerLastUpdated = vehicleKilometerLastUpdated;
    }
}
