public class Hand {
    private int l, s;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "l=" + l +
                ", s=" + s +
                '}';
    }
}
