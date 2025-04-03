package com.example.DTO;

public class PaymentDTO {
    int transaction_id;
    int vehicle_id;
    int amount;
    String payment_method;

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }
}
