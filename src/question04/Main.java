package question04;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Car
        Car car = new Car("Toyota Camry", 55.0, 5);
        int rentalDaysForCar = 7; // Example rental period in days
        double costForCar = car.calculateRentalCost(rentalDaysForCar);
        System.out.println("Total rental cost for " + car.model + " for " + rentalDaysForCar + " days is $" + costForCar);

        // Creating an instance of Motorcycle
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", 80.0, 1200);
        int rentalDaysForMotorcycle = 5; // Example rental period in days
        double costForMotorcycle = motorcycle.calculateRentalCost(rentalDaysForMotorcycle);
        System.out.println("Total rental cost for " + motorcycle.model + " for " + rentalDaysForMotorcycle + " days is $" + costForMotorcycle);
    }
}
