package com.sentinel.payment;

// Fix for a critical race condition in payment processing.
public class TransactionProcessor {
    private static final Object lock = new Object();

    public void processTransaction(String transactionId) {
        synchronized(lock) {
            // Database and payment gateway logic goes here.
        }
    }
}
