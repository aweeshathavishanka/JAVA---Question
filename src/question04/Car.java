package question04;

public class Car extends Vehicle {
    private int numSeats;

    // Overloaded constructor
    public Car(String model, double rentalPricePerDay, int numSeats) {
        super(model, rentalPricePerDay); // Call the constructor of the base class
        this.numSeats = numSeats;
    }
}
