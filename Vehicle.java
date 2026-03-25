// Vehicle.java
class Vehicle {
    String type;
    int weight;

    Vehicle(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }
}

class Car extends Vehicle {
    Car() {
        super("Car", 1);
    }
}

class Bike extends Vehicle {
    Bike() {
        super("Bike", 1);
    }
}

class Truck extends Vehicle {
    Truck() {
        super("Truck", 3);
    }
}