package question04;

public class Motorcycle extends Vehicle {
    private int engineCapacity;

    // Overloaded constructor
    public Motorcycle(String model, double rentalPricePerDay, int engineCapacity) {
        super(model, rentalPricePerDay);
        this.engineCapacity = engineCapacity;
    }
}
