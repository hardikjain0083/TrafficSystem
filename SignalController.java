// SignalController.java
class SignalController {

    private ControlStrategy strategy;

    SignalController(ControlStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ControlStrategy strategy) {
        this.strategy = strategy;
    }

    public void manageTraffic(Road[] roads) {
        for (Road road : roads) {
            double density = road.calculateDensity();
            int time = strategy.computeGreenTime(density);

            System.out.println("Road " + road.getName() +
                    " Density: " + density +
                    " → GREEN for " + time + " seconds");
        }
    }
}