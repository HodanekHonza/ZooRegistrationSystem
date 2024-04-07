package org.example.zoo;

import java.time.LocalTime;
import java.util.UUID;

public class Animal {
    private String name;
    private UUID uuid;
    private LocalTime timeOfFeeding;

    private LocalTime lastTimeCheckedByVeterinary;

    public String getName() {
        return name;
    }


    public UUID getUUID() {
        return uuid;
    }

    public LocalTime getTimeOfFeeding() {
        return timeOfFeeding;
    }

    public void setTimeOfFeeding(LocalTime time) {
       this.timeOfFeeding = time;
    }

    public void setTimeOfVeterinaryCheck(LocalTime time) {
        this.lastTimeCheckedByVeterinary = time;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.uuid = UUID.randomUUID();
        this.name = name;

    }
}
