package com.example.Service;

import com.example.Entity.paymentEntity;

import java.util.List;

public interface paymentService {
    List<paymentEntity> getAllPayment();
    paymentEntity getTransactionById(int transaction_id);
    paymentEntity createTransaction(paymentEntity paymententity);
    void deleteTransaction(int transaction_id);
    paymentEntity updateTransaction(int transaction_id, paymentEntity paymententity);
}
