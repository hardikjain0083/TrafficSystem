// SignalController.java
class SignalController {
    private ControlStrategy strategy;

    SignalController(ControlStrategy strategy) {
        this.strategy = strategy;
    }

    void manageTraffic(Road[] roads) {
        for (Road road : roads) {
            int time = strategy.calculateGreenTime(road);
            System.out.println("Road " + road.name + " GREEN for " + time + " seconds");
        }
    }
}