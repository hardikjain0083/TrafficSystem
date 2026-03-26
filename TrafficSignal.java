// TrafficSignal.java
class TrafficSignal {
    private String state;
    private int greenTime;

    private final int MIN_TIME = 10;
    private final int MAX_TIME = 120;

    TrafficSignal() {
        this.state = "RED";
        this.greenTime = MIN_TIME;
    }

    public void setGreenDuration(int time) {
        if (time < MIN_TIME) {
            greenTime = MIN_TIME;
        } else if (time > MAX_TIME) {
            greenTime = MAX_TIME;
        } else {
            greenTime = time;
        }
        state = "GREEN";
    }

    public String getState() {
        return state;
    }

    public int getGreenTime() {
        return greenTime;
    }
}