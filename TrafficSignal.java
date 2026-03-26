// TrafficSignal.java
class TrafficSignal {
    private String state;
    private int greenTime;

    TrafficSignal() {
        this.state = "RED";
        this.greenTime = 0;
    }

    public void setGreen(int time) {
        this.state = "GREEN";
        this.greenTime = time;
    }

    public void setRed() {
        this.state = "RED";
    }

    public String getState() {
        return state;
    }

    public int getGreenTime() {
        return greenTime;
    }
}