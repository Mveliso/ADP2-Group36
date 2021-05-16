/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.ticketbookingsystem;

/**
 *
 * @author Mveliso Roto 
 * 214211983
 * Creating a booking class.
 */
public class Flight {
    private int flightNumber;
    private String placeOfDeparture;
    private String destination;
    private String estimstedTimeOfArival;
    private String flightDuration;

    public Flight() {
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getPlaceOfDeparture() {
        return placeOfDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public String getEstimstedTimeOfArival() {
        return estimstedTimeOfArival;
    }

    public String getFlightDuration() {
        return flightDuration;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setPlaceOfDeparture(String placeOfDeparture) {
        this.placeOfDeparture = placeOfDeparture;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setEstimstedTimeOfArival(String estimstedTimeOfArival) {
        this.estimstedTimeOfArival = estimstedTimeOfArival;
    }

    public void setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
    }

    @Override
    public String toString() {
        return "-------Flight--------- " +
               "\n Flight Number            : " + flightNumber + 
               "\n Place Of Departure       : " + placeOfDeparture +
               "\n Destination              : " + destination + 
               "\n Estimsted Time Of Arival : " + estimstedTimeOfArival + 
               "\n Flight Duration          : " + flightDuration ;
    }
  

    
    
}
