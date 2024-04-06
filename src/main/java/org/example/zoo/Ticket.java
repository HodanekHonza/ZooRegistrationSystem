package org.example.zoo;

public class Ticket {
    public String ticketToWherePavilon;
    public int usage;



    Ticket(String ticketToWherePavilon, int pavilonNumber) {
        this.ticketToWherePavilon = ticketToWherePavilon;
        this.usage = pavilonNumber;
    }
}
