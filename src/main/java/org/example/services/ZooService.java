package org.example.services;
import org.example.zoo.Zoo;

import java.util.ArrayList;
import java.util.UUID;

public class ZooService {

    private static Zoo instance;


    private ZooService() {
    }


    public static Zoo createZoo(String name) {
        if (instance == null) {
            instance = new Zoo(name);
        }
        return instance;
    }
}

