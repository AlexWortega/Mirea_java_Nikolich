public class Leg {
    private int h, w, s_f;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getS_f() {
        return s_f;
    }

    public void setS_f(int s_f) {
        this.s_f = s_f;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "h=" + h +
                ", w=" + w +
                ", s_f=" + s_f +
                '}';
    }
}
