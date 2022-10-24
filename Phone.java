public class Phone {
    // builder rzeczownik
    boolean turnedOn;
    int hour;

    public Phone(boolean turnedOn, int hour) {
        this.turnedOn = turnedOn;
        this.hour = hour;
    }

    void turnOnOrOff() {
        turnedOn = !turnedOn;
    }

    int timeFromDevice() {
        return hour;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "turnedOn=" + turnedOn +
                ", hour=" + hour +
                '}';
    }
}