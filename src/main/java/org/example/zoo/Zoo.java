package org.example.zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Zoo {
    public String name;
    private ArrayList<UUID> pavilonUUIDs = new ArrayList<>();


    public void addPavilon(Pavilon pavilon) {
        UUID uuid = UUID.randomUUID();
        pavilonUUIDs.add(uuid);
        Database.pavilonHashMap.put(uuid, pavilon);
    }

    public void listPavilons() {
        System.out.println();
        System.out.println();
        System.out.println("Pavilons in - " + name + " - Zoo");
        System.out.println("------------------------");

        for (UUID element : pavilonUUIDs) {
            Database.pavilonHashMap.forEach((key, value) -> {
                if (element == key) {
                    System.out.println(value.getNameOfPavilon());
                }
            });
        }
        System.out.println("------------------------");
        System.out.println();
    }

    public void AddAnimalToPavilon(String nameOfPavilon, Animal animal) {
        Database.pavilonHashMap.forEach((key, value) -> {
            if (value.getNameOfPavilon().equals(nameOfPavilon)) {
                value.addAnimalToPavilon(animal);
            }
        });
    }

    public void todayCareForAnimal(String nameOfPavilon, String nameOfAnimal) {
        Database.pavilonHashMap.forEach((key, value) -> {
            if (nameOfPavilon.equals(value.getNameOfPavilon())) {
                value.animalCareToday(nameOfAnimal);
            }
        });
    }

    public void listAnimalsFromPavilon(String nameOfPavilon) {
        System.out.println();
        System.out.println();
        System.out.println("Animals in - " + nameOfPavilon + " - Pavilon");
        System.out.println("------------------------");
        Database.pavilonHashMap.forEach((key, value) -> {
            if (nameOfPavilon.equals(value.getNameOfPavilon())) {
                value.listAnimalsInPavilon();
            }
        });
        System.out.println("------------------------");
        System.out.println();
    }

    public Zoo(String name) {
        this.name = name;
    }
}
