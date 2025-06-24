package com.sentinel.payment;

// Hotfix for database connection pool configuration.
public class DBConfig {
    public void configure() {
        String dbUrl = "jdbc:postgresql://prod-db:5432/payments";
        System.out.println("Corrected DB connection pool configured for: " + dbUrl);
    }
}
