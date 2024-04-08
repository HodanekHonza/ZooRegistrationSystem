package org.example;

import org.example.zoo.Animal;
import org.example.zoo.Pavilon;
import org.example.zoo.Veterinary;
import org.example.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zooPrague = new Zoo("Prague");
        zooPrague.addPavilon(new Pavilon("African animals"));
        zooPrague.addPavilon(new Pavilon("American animals"));
        zooPrague.listPavilons();
        zooPrague.AddAnimalToPavilon("African animals", new Animal("Leopard"));

        zooPrague.AddAnimalToPavilon("African animals", new Animal("Zebra"));
        zooPrague.AddAnimalToPavilon("African animals", new Animal("Lion"));
        zooPrague.AddAnimalToPavilon("American animals", new Animal("Bear"));
        zooPrague.listAnimalsFromPavilon("American animals");
        zooPrague.listAnimalsFromPavilon("African animals");

        zooPrague.addVeterinary(new Veterinary("African animals"));
        System.out.println(zooPrague.getAnimal("African animals", "Lion"));




        //zooPrague.getVeterinary("African animals").addAnimalToVeterinary(zooPrague.getAnimal("African animals", "Lion").getUUID());
        zooPrague.addAnimalToVeterinary("African animals",zooPrague.getAnimal("African animals", "Lion"));
        zooPrague.addAnimalToVeterinary("African animals",zooPrague.getAnimal("African animals", "Zebra"));
        //zooPrague.getVeterinary("African animals").checkHealthOfAnimal(zooPrague.getAnimal("African animals", "Lion"));
        zooPrague.getVeterinary("African animals").listAnimalsInVeterinary();

    }
}