public class Chair extends Furniture {
    private boolean isBroken;

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    protected Chair(int price, String color, int length) {
        super(price, color, length);
    }

    @Override
    public void totrow() {
        System.out.println("Зачем кидать стул.....");
    }

    @Override
    public String toString() {
        return "Chair{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", length=" + length +
                '}';
    }
}
