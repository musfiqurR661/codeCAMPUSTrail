package com.example.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Shared MySQL connection settings. Override with environment variables:
 * CODECAMPUS_DB_URL, CODECAMPUS_DB_USER, CODECAMPUS_DB_PASSWORD.
 */
public final class Database {
    public static final String URL = envOrDefault(
            "CODECAMPUS_DB_URL",
            "jdbc:mysql://127.0.0.1:3306/musfiq?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC");
    public static final String USER = envOrDefault("CODECAMPUS_DB_USER", "root");
    public static final String PASSWORD = envOrDefault("CODECAMPUS_DB_PASSWORD", "");

    private Database() {
    }

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private static String envOrDefault(String key, String fallback) {
        String value = System.getenv(key);
        if (value == null || value.isBlank()) {
            return fallback;
        }
        return value;
    }
}
