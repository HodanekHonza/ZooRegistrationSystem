package org.example.zoo;

import java.util.UUID;

public class Animal {
    private String name;
    private UUID uuid;
    private int timeOfFeeding;

    private boolean wasCheckedByVetToday;

    public String getName() {
        return name;
    }


    public UUID getUUID() {
        return uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.uuid = UUID.randomUUID();
        this.name = name;

    }
}
