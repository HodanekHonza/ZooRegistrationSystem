package org.example.zoo;

import java.util.ArrayList;
import java.util.UUID;

//test case from main
public class Pavilon {
    private String nameOfPavilon;
    private ArrayList<UUID> animalUUIDs = new ArrayList<>();

    public void addAnimalToPavilon(Animal animal) {
        UUID uuid = UUID.randomUUID();
        animalUUIDs.add(uuid);
        Database.animalHashMap.put(uuid, animal);
    }

    public String getNameOfPavilon() {
        return nameOfPavilon;
    }

    public void listAnimalsInPavilon() {
        for (UUID element : animalUUIDs) {
            Database.animalHashMap.forEach((key, value) -> {
                if (element == key) {
                    System.out.println(value.getName());
                }
            });
        }
    }

    public UUID getAnimalUUID(String nameOfAnimal) {
        for (UUID element : animalUUIDs) {
            Animal animal = Database.animalHashMap.get(element);
            if (animal != null && nameOfAnimal.equals(animal.getName())) {
                return animal.getUUID();
            }
        }
        return null;
    }
    public Animal getAnimal(String nameOfAnimal) {
        for (UUID element : animalUUIDs) {
            Animal animal = Database.animalHashMap.get(element);
            if (animal != null && nameOfAnimal.equals(animal.getName())) {
                return animal;
            }
        }
        return null;
    }

    public Pavilon(String nameOfPavilon) {
        this.nameOfPavilon = nameOfPavilon;
    }
}

