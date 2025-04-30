package StaticAndNormalMethods;

  class TruckInventory {
    private int truckCount = 0; // Instance variable

    // Instance method
    public void addTruck(Truck truck) {
        truckCount++;
        System.out.println("Added truck: " + truck + ", Total count: " + truckCount);
    }

    // Static method
    public static void resetCount() {
        // Cannot access truckCount directly because it's an instance variable
        System.out.println("Reset count (static method, no instance data access)");
    }
}

public class NormalAndStaticMethod1 {
    public static void main(String[] args) {
        // Create TruckInventory object
        TruckInventory inventory = new TruckInventory();

        // Call instance method
        Truck truck1 = new Truck("Chevrolet Silverado", 2021);
        inventory.addTruck(truck1); // Output: Added truck: Truck [Model: Chevrolet Silverado, Year: 2021], Total count: 1

        // Call static method
        TruckInventory.resetCount(); // Output: Reset count (static method, no instance data access)
    }

}
