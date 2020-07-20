package logic; //specifies which package the class lives in 

import domain.Airplane;
import domain.Flight;
import domain.Place;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author laloschjetnan
 */

//this class will have all the methods related to the logic of the application
public class FlightControl {

    //the instance variablesa are hashmaps that store data based on the application's domain
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;

    //constructor - starts each hashmap when called
    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    //takes a string and an integer and creates a new Airplane object
    public void addAirplane(String ID, int capacity) {
        this.airplanes.put(ID, new Airplane(ID, capacity));
    }

    //Creates a flight object based on the parameters passed 
    public void addFlight(Airplane airplane, String originID, String destinationID) {
        this.places.putIfAbsent(originID, new Place(originID)); //if a place doesn't ealready exist, it creates it
        this.places.putIfAbsent(destinationID, new Place(destinationID));

        Flight flight = new Flight(this.places.get(originID), this.places.get(destinationID), airplane); //creates the flight
        this.flights.put(flight.toString(), flight); //adds the new flight to the flight map
    }

    //returns an airplane object based on a string parameter (key)
    public Airplane getAirplane(String planeID) {
        if (this.airplanes.containsKey(planeID)) {
            return this.airplanes.get(planeID);
        }
        return null;
    }

    //returns a place object based on a string parameter (key)
    public Place getPlace(String placeID) {
        if (this.places.containsKey(placeID)) {
            return this.places.get(placeID);
        }
        return null;
    }

    //uses a stream and lamda expression to print all the planes on the map
    public void printPlanes() {
        this.airplanes.values().stream().forEach(plane -> System.out.println(plane));
    }

    //uses a stream and lamda expression to print all the flights on the map
    public void printFlights() {
        this.flights.values().stream().forEach(flight -> System.out.println(flight));
    }

    //looks up a plane based on a string (key) and returns the planes details
    public void printAirplaneDetails(String planeID) {
        if (this.airplanes.containsKey(planeID)) {
            System.out.println(this.airplanes.get(planeID));
        } else {
            System.out.println("Plane not found");
        }
    }

}
