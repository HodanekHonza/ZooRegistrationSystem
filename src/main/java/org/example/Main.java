package org.example;

import org.example.zoo.Animal;
import org.example.zoo.Pavilon;
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
        zooPrague.todayCareForAnimal("American animals", "Bear");
//        Zoo zooPilsen = new Zoo("Pilsen");
//        zooPilsen.addPavilon(new Pavilon("American animals"));
//        zooPilsen.listPavilons();
    }
}