public class Arrival {
    private int from;
    private int to;
    private int length;
    private int arrivalTime;

    public Arrival(int from, int to, int length, int arrivalTime) {
        this.from = from;
        this.to = to;
        this.length = length;
        this.arrivalTime = arrivalTime;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Arrival{" +
                "from=" + from +
                ", to=" + to +
                ", length=" + length +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}
