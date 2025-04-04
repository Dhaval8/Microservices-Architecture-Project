package com.example.Service;

import com.example.Entity.paymentEntity;
import com.example.Repository.paymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class paymentServiceImpl implements paymentService{

    @Autowired
    paymentRepository repo;


    @Override
    public List<paymentEntity> getAllPayment() {
        return repo.findAll();
    }

    @Override
    public paymentEntity getTransactionById(int transaction_id) {
        return repo.findById(transaction_id)
                .orElseThrow(() -> new RuntimeException("Transaction not found with ID: " + transaction_id));
    }

    @Override
    public paymentEntity createTransaction(paymentEntity payment) {

        return repo.save(payment);
    }

    @Override
    public void deleteTransaction(int transaction_id) {
        repo.deleteById(transaction_id);
    }

    public paymentEntity updateTransaction(int id, paymentEntity payment) {
        return repo.findById(id)
                .map(existingPayment -> {
                    existingPayment.setVehicle_id(payment.getVehicle_id());
                    existingPayment.setAmount(payment.getAmount());
                    existingPayment.setPayment_method(payment.getPayment_method());
                    return repo.save(existingPayment);
                }).orElseThrow(() -> new RuntimeException("Payment not found with id " + id));
    }



}
