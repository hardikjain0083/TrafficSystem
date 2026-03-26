// Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of roads: ");
        int n = sc.nextInt();

        Road[] roads = new Road[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter road name: ");
            String name = sc.next();

            roads[i] = new Road(name);

            System.out.print("Enter number of vehicles: ");
            int v = sc.nextInt();

            for (int j = 0; j < v; j++) {
                roads[i].addVehicle(new Car());
            }
        }

        SignalController controller = new SignalController(new NormalStrategy());
        controller.manageTraffic(roads);
    }
}