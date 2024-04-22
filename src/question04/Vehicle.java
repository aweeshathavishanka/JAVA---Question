package question04;

public class Vehicle {
    protected String model;
    protected double rentalPricePerDay;

    // Overloaded constructor
    public Vehicle(String model, double rentalPricePerDay) {
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    // Method to calculate rental cost
    public double calculateRentalCost(int days) {
        return days * rentalPricePerDay;
    }
}

