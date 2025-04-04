package com.example.Controller;

import com.example.Entity.paymentEntity;
import com.example.Service.paymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//int transaction_id;
//    //int vehicle_id;
//    int amount;
//    String payment_method;

@RestController
//@RequestMapping("/transactions")
public class paymentController {
    @Autowired
    paymentService paymentservice;

    @GetMapping
    public ResponseEntity<List<paymentEntity>> getAllPayment() {
        List<paymentEntity> payments = paymentservice.getAllPayment();
        if (payments.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(payments);
    }


    @GetMapping("/{transaction_id}")
    public ResponseEntity<paymentEntity> getTransactionById(@PathVariable("transaction_id") int transactionId) {
        paymentEntity transaction = paymentservice.getTransactionById(transactionId);
        return ResponseEntity.ok(transaction);
    }

    @PostMapping
    public ResponseEntity<paymentEntity> createTransaction(@RequestBody paymentEntity paymententity) {
        paymentEntity createdTransaction = paymentservice.createTransaction(paymententity);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTransaction);
    }

    @PutMapping("/{id}")
    public ResponseEntity<paymentEntity> updateTransaction(@PathVariable("id") int transactionId,
                                                           @RequestBody paymentEntity paymententity) {
        paymentEntity updatedTransaction = paymentservice.updateTransaction(transactionId, paymententity);
        return ResponseEntity.ok(updatedTransaction);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTransaction(@PathVariable("id") int transactionId) {
        paymentservice.deleteTransaction(transactionId);
        return ResponseEntity.ok("Transaction with ID " + transactionId + " deleted successfully.");
    }

}
