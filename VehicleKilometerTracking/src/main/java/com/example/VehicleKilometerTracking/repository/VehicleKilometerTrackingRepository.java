package com.example.VehicleKilometerTracking.repository;

import com.example.VehicleKilometerTracking.entity.VehicleKilometerTracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleKilometerTrackingRepository extends JpaRepository<VehicleKilometerTracking, Integer> {}
