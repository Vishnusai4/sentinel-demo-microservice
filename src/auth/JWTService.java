package com.sentinel.auth;

// Initial JWT Service implementation. Uses a static secret for demo purposes.
public class JWTService {
    private static final String SECRET_KEY = "your-256-bit-secret";

    public String generateToken(String userId) {
        // Logic to generate a JWT token.
        return "jwt." + userId;
    }
}
