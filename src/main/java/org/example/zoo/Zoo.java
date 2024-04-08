package org.example.zoo;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public class Zoo {
    public String name;
    private ArrayList<UUID> pavilonUUIDs = new ArrayList<>();

    private ArrayList<UUID> veterinaryUUIDs = new ArrayList<>();

    public void addPavilon(Pavilon pavilon) {
        UUID uuid = UUID.randomUUID();
        pavilonUUIDs.add(uuid);
        Database.pavilonHashMap.put(uuid, pavilon);
    }

    public void addVeterinary(Veterinary veterinary) {
        UUID uuid = UUID.randomUUID();
        veterinaryUUIDs.add(uuid);
        Database.veterinaryHashMap.put(uuid, veterinary);
    }

//    apperently you cant return Animal from foreach so i need to use chatgpt aproach
//    public Veterinary getVeterinary(String nameOfVeterinary) {
//        Database.veterinaryHashMap.forEach((key, value) -> {
//            if (value != null && value.getNameOfVeterinary().equals(nameOfVeterinary)) {
//                return value;
//            }
//        });
//        return null;
//    }
//

    public Veterinary getVeterinary(String nameOfVeterinary) {
//        for (UUID uuid : veterinaryUUIDs) {
//            Database.veterinaryHashMap.forEach((key,value) -> {
//                if (value.getNameOfVeterinary().equals(nameOfVeterinary) && key == uuid) {
//                    return value;
//                }
//            });
//        }
        for (Map.Entry<UUID, Veterinary> entry : Database.veterinaryHashMap.entrySet()) {
            Veterinary veterinary = entry.getValue();
            if (veterinary != null && veterinary.getNameOfVeterinary().equals(nameOfVeterinary)) {
                //System.out.println(veterinary);
                return veterinary;
            }
        }
        return null;
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

    public void addAnimalToVeterinary(String nameOfVeterinary
            , Animal animal) {
        Database.veterinaryHashMap.forEach((key, value) -> {
            if (value.getNameOfVeterinary().equals(nameOfVeterinary)) {
                value.addAnimalToVeterinary(animal.getUUID());
            }
        });
    }


    // WHY DIDNT THE SECOND APROACH WORK? need to ask teacher
    public Animal getAnimal(String nameOfPavilon, String nameOfAnimal) {
        for (Map.Entry<UUID, Pavilon> entry : Database.pavilonHashMap.entrySet()) {
            Pavilon pavilon = entry.getValue();
            if (nameOfPavilon.equals(pavilon.getNameOfPavilon())) {
                Animal animal = pavilon.getAnimal(nameOfAnimal);
                if (animal != null) {
                    return animal;
                }
            }
        }
        return null;
    }

//    public UUID getAnimal(String nameOfPavilon, String nameOfAnimal) {
//
//        Database.pavilonHashMap.forEach((key, value) -> {
//            if (nameOfPavilon.equals(value.getNameOfPavilon())) {
//                value.getAnimal(nameOfAnimal);
//
//            }
//        });
//        return null;
//    }


//    public void veterinaryCare(String nameOfVeterinaryCare, UUID animalUUID) {
//        Database.veterinaryHashMap.forEach((key, value) -> {
//            if (value.getNameOfVeterinary().equals(nameOfVeterinaryCare)) {
//                value.addAnimalToVeterinaryAndWriteNote(animalUUID);
//            }
//        });
//    }

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

    public String getName() {
        return name;
    }

    public Zoo(String name) {
        this.name = name;
    }
}
