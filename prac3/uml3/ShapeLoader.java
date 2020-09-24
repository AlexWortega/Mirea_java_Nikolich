public class ShapeLoader {
    public static void main(String[] args) {
        Circle circle = new Circle("white",true,5.5);

        System.out.println(circle.getArea());
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(5,4);

        System.out.println(rectangle);
        System.out.println(rectangle.getPerimeter());

        Square square = new Square(10);
        System.out.println(square);
        System.out.println(square.getArea());

    }
}
