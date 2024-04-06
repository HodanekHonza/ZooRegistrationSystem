package org.example.services;

public class ZooService {

    private static ZooService instance;

    // Private constructor to prevent instantiation from outside
    private ZooService() {
        // Initialize your service here
    }

    // Method to get the singleton instance of ZooService
    public static synchronized ZooService getInstance() {
        if (instance == null) {
            instance = new ZooService();
        }
        return instance;
    }

    // Your methods for interacting with the ZooService go here

}

