package org.example.zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Zoo {
    public String name;
    private ArrayList<Pavilon> pavilony = new ArrayList<>();
    public void addPavilon(Pavilon pavilon) {
        //UUID uuid = UUID.randomUUID(); // Generate a random UUID
        pavilony.add(pavilon);
    }
    public void listPavilons() {
        System.out.println("LIST OF PAVILONS");
        for (Pavilon pavilon : pavilony) {
            System.out.println(pavilon.getNameOfPavilon());
        }
        System.out.println("----------------------");
    }
    public void addAnimalToPavilon(String nameOfPavilon, Animal animal) {
        for (Pavilon pavilon : pavilony) {
            if (pavilon.getNameOfPavilon().equals(nameOfPavilon)) {
                pavilon.addAnimalToPavilon(animal);
            }
        }
    }
    public void returnNameOfPavilonWhereAnimalIs() {

    }

    public void getAnimalInPavilon(String name) {
        for (Pavilon pavilon : pavilony) {
           for (Animal animal : pavilon.zvirata) {
               if (animal.getName().equals(name)){
                    System.out.println("Animal you searched for is in pavilon: " +pavilon.getNameOfPavilon());
               }
           }
        }
    }
    public void getAnimalsInPavilon(String nameOfPavilon) {
        for (Pavilon pavilon : pavilony) {
            if (pavilon.getNameOfPavilon().equals(nameOfPavilon)) {
                pavilon.listAllAnimals();
            }
        }
    }
    public void buyTicket() {

    }
    public Zoo(String name) {
        this.name = name;
    }
}
