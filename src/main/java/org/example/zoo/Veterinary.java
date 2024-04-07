package org.example.zoo;

import java.util.ArrayList;
import java.util.UUID;

public class Veterinary {
    private ArrayList<UUID> animalUUIDs = new ArrayList<>();

    private String nameOfVeterinary;

    public void addAnimalToVeterinaryAndWriteNote(Animal animal) {
        UUID uuid = UUID.randomUUID();
        animalUUIDs.add(uuid);
        // CsvWriterVeterinary.writeDataLineByLine("/home/jan/IdeaProjects/ZooRegistrationSystem/src/main/java/org/example/data.csv", animal);
    }

    public void listAnimalsInVeterinary() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("List of Animals in - " + nameOfVeterinary + " - Veterinary");
        for (UUID uuid : animalUUIDs) {
            Database.animalHashMap.forEach((key, value) -> {
                if (uuid == key) {
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
