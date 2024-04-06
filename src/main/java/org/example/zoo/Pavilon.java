package org.example.zoo;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
//            alternative suggested by gpt, mine works good but i guess one less forEach is better
//            Animal animal = Database.animalHashMap.get(element);
//            if (animal != null) {
//                System.out.println(animal.getName());
//            }
            Database.animalHashMap.forEach((key, value) -> {
                if (element == key) {
                    System.out.println(value.getName());
                }
            });
        }
    }


    // this function will serve different purpose, i just needed to connect it, will update animal status and
    // write vet note to file system, but need vet class for that first, that's challenge for tomorrow.
    public void animalCareToday(String nameOfAnimal) {
        for (UUID element : animalUUIDs) {
            Database.animalHashMap.forEach((key, value) -> {
                if (nameOfAnimal.equals(value.getName()) && key.equals(element)) {
                    System.out.println(value.getName());
                }
            });
        }
    }

    public Pavilon(String nameOfPavilon) {
        this.nameOfPavilon = nameOfPavilon;
    }
}

