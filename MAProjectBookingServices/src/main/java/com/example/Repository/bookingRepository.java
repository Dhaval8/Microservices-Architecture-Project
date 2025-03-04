package com.example.Repository;

import com.example.Entity.bookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookingRepository extends JpaRepository<bookingEntity, Integer> {
}
