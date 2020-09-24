public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 4*this.width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
