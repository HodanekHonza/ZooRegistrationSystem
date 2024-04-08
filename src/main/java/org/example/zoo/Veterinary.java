package org.example.zoo;

import java.util.ArrayList;
import java.util.UUID;

public class Veterinary {
    private ArrayList<UUID> animalUUIDs = new ArrayList<>();

    private final String nameOfVeterinary;


    public void addAnimalToVeterinary(UUID animalUUID) {
        animalUUIDs.add(animalUUID);
    }

    public void checkHealthOfAnimal(Animal animal) {
        for (UUID uuid : animalUUIDs) {
            if (uuid.equals(animal.getUUID())) {
                CsvWriterVeterinary.writeDataLineByLine("/home/jan/IdeaProjects/ZooRegistrationSystem/src/main/java/org/example/data.csv", animal);
            }
        }

    }

    public void listAnimalsInVeterinary() {
        System.out.println();
        System.out.println("List of Animals in - " + nameOfVeterinary + " - Veterinary");
        System.out.println("------------------------");
        for (UUID uuid : animalUUIDs) {
            Database.animalHashMap.forEach((key, value) -> {
                if (uuid.equals(value.getUUID())) {
                    System.out.println(value.getName());
                }
            });
        }
        System.out.println();
        System.out.println("------------------------");
        System.out.println();
    }


    public String getNameOfVeterinary() {
        return nameOfVeterinary;
    }

    public Veterinary(String name) {
        this.nameOfVeterinary = name;
    }
}
