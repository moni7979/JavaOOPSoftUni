package abstraction.p4TrafficLight;

public class TrafficLight {


    enum Signal {
        RED,
        GREEN,
        YELLOW;

    }
    private Signal signal;

    public TrafficLight(Signal signal) {
        this.signal = signal;
    }

    public void update() {
        switch (this.signal) {

            case RED -> {
                this.signal = Signal.GREEN;
            }
            case GREEN -> {
                this.signal = Signal.YELLOW;
            }
            case YELLOW -> {
                this.signal = Signal.RED;
            }
        }
    }

    public Signal getSignal() {
        return signal;
    }
}
