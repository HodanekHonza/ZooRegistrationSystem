package org.example;

import org.example.zoo.Animal;
import org.example.zoo.Database;
import org.example.zoo.Pavilon;
import org.example.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo novaZoo = new Zoo("Praha");
        novaZoo.addPavilon(new Pavilon("Africka zvirata"));

        novaZoo.addPavilon(new Pavilon("Evropska zvirata"));
        novaZoo.listPavilons();
        novaZoo.addAnimalToPavilon("Africka zvirata", new Animal("leopard"));
        novaZoo.addAnimalToPavilon("Africka zvirata", new Animal("zirafa"));
        novaZoo.addAnimalToPavilon("Africka zvirata", new Animal("lev"));
        novaZoo.getAnimalsInPavilon("Africka zvirata");
        novaZoo.getAnimalInPavilon("zirafa");
    }
}