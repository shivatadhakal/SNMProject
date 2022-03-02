public class Progress {
    private int from;
    private int to;
    private int end;

    public Progress(int from, int to, int end) {
        this.from = from;
        this.to = to;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Progress{" +
                "from=" + from +
                ", to=" + to +
                ", end=" + end +
                '}';
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

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
