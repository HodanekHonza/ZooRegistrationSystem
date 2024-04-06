package org.example.zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Pavilon {
    public ArrayList<Animal> zvirata = new ArrayList<>();
    public void addAnimalToPavilon(Animal animal) {
        zvirata.add(animal);
    }
    private String nameOfPavilon;

    @Override
    public String toString() {
        return nameOfPavilon;
    }
    public void setNameOfPavilon(String nameOfPavilon) {
        this.nameOfPavilon = nameOfPavilon;
    }
    public String getNameOfPavilon() {
        return nameOfPavilon;
    }
    public void listAllAnimals() {
        for (Animal element : zvirata) {
            System.out.println(element.getName());
        }
    }
    public Pavilon(String nameOfPavilon) {
        this.nameOfPavilon = nameOfPavilon;
    }
}

