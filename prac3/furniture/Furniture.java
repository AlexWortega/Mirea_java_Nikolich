public abstract class Furniture {
    protected int price;
    protected String color;
    protected int length;

    public int getPrice() {
        return price;
    }

    protected Furniture(int price, String color, int length) {
        this.price = price;
        this.color = color;
        this.length = length;
    }

    public abstract void toTrow();
}
