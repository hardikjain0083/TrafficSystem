// Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of roads: ");
        int n = sc.nextInt();

        Road[] roads = new Road[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter road name: ");
            String name = sc.next();

            roads[i] = new Road(name);

            System.out.print("Enter number of vehicles on road " + name + ": ");
            int v = sc.nextInt();

            for (int j = 0; j < v; j++) {
                System.out.print("Enter vehicle type (car/bike/truck): ");
                String type = sc.next().toLowerCase();

                if (type.equals("car")) {
                    roads[i].addVehicle(new Car("C" + j));
                } 
                else if (type.equals("bike")) {
                    roads[i].addVehicle(new Bike("B" + j));
                } 
                else if (type.equals("truck")) {
                    roads[i].addVehicle(new Truck("T" + j));
                } 
                else {
                    System.out.println("Invalid type, adding Car by default.");
                    roads[i].addVehicle(new Car("C" + j));
                }
            }
        }

        // Strategy selection
        System.out.print("\nChoose strategy (1: Normal, 2: Heavy Traffic): ");
        int choice = sc.nextInt();

        ControlStrategy strategy;

        if (choice == 2) {
            strategy = new HeavyTrafficStrategy();
        } else {
            strategy = new NormalStrategy();
        }

        SignalController controller = new SignalController(strategy);
        controller.manageTraffic(roads);

        sc.close();
    }
}