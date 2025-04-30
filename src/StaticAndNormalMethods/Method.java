package StaticAndNormalMethods;
class Truck {
    private String model;
    private int year;

    public Truck(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Override toString to customize output
   @Override
    public String toString() {
        return "Truck [Model: " + model + ", Year: " + year + "]";
    }
}

class TruckManager {
    public void addTruck(Truck truck) {
        // Accessing the truck instance and printing it
        System.out.println("Added: " + truck);
    }
}

public class Method {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford F150", 2020);
        TruckManager manager = new TruckManager();
        manager.addTruck(truck); // Output: Added: Truck [Model: Ford F150, Year: 2020]
    }
}