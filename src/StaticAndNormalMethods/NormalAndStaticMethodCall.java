package StaticAndNormalMethods;

class TruckUtility {
    // Static method
    public static void printTruckCount(int count) {
        System.out.println("Total trucks: " + count);
    }

    // Instance method
    public void describeTruck(Truck truck) {
        System.out.println("Truck details: " + truck);//here also it will directly go to truck class of Method.java and toString will get initiated.
    }
}

public class NormalAndStaticMethodCall {
    public static void main(String[] args) {
        // Calling static method (no object needed)
        TruckUtility.printTruckCount(5); // Output: Total trucks: 5

        // Calling instance method (requires an object)
        TruckUtility utility = new TruckUtility();
        Truck truck = new Truck("Toyota Tacoma", 2018);//here we are taking help of Truck class in method.java
        utility.describeTruck(truck); // Output: Truck details: Truck [Model: Toyota Tacoma, Year: 2018]
    }
}