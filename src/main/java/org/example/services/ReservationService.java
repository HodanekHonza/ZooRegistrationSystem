package org.example.services;

import org.example.zoo.ReservationSystem;
import org.example.zoo.Zoo;

public class ReservationService {
        private static ReservationSystem instance;


        private ReservationService() {
        }


        public static ReservationSystem createReservationSystem(String name) {
            if (instance == null) {
                instance = new ReservationSystem();
            }
            return instance;
        }
    }
