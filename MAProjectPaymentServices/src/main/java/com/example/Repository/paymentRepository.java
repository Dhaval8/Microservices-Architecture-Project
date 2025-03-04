package com.example.Repository;

import com.example.Entity.paymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface paymentRepository extends JpaRepository<paymentEntity, Integer> {
}
