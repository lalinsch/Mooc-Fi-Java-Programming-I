package domain;

/**
 *
 * @author laloschjetnan
 */
public class Flight {

    //flight instance variables (uses objects created in other classes in the same package)
    private Place origin;
    private Place destination;
    private Airplane plane;

    //constructor
    public Flight(Place origin, Place destination, Airplane plane) {
        this.origin = origin;
        this.destination = destination;
        this.plane = plane;
    }

    //specifies how a flight should be printed in the console
    @Override
    public String toString() {
        return this.plane.toString() + " (" + this.origin + "-" + this.destination + ")";
    }

}
