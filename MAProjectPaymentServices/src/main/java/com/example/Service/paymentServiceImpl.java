package com.example.Service;

//import com.example.Config.paymentConfig;
import com.example.Entity.paymentEntity;
import com.example.Repository.paymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class paymentServiceImpl implements paymentService{

    @Autowired
    paymentRepository repo;

//    @Autowired
//    paymentConfig paymentconfig;

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
    public paymentEntity createTransaction(paymentEntity paymententity) {
        return repo.save(paymententity);
    }

    @Override
    public void deleteTransaction(int transaction_id) {
        repo.deleteById(transaction_id);
    }

    @Override
    public paymentEntity updateTransaction(int transaction_id, paymentEntity paymententity) {
        Optional<paymentEntity> pay = repo.findById(transaction_id);
        if(pay.isEmpty()){
            return null;
        } else{
            paymentEntity existingpay = pay.get();
            existingpay.setAmount(paymententity.getAmount());
            existingpay.setPayment_method(paymententity.getPayment_method());
            return repo.save(existingpay);
        }
    }


//    public OrderResponseDTO getOrderDetails(int transaction_id) {
//        Order order = orderRepository.findById(orderId)
//                .orElseThrow(() -> new RuntimeException("Order not found"));
//
//        CustomerDTO customer = customerClient.getCustomerById(order.getCustomerId());
//
//        return new OrderResponseDTO(order.getId(), order.getProduct(), customer);
//    }
}
