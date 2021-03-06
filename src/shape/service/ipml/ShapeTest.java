package shape.service.ipml;

import shape.model.Circle;
import shape.model.Rectangle;
import shape.model.Shape;
import shape.model.Square;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Circle circle1 = new Circle(5, "red", false);
        System.out.println(circle1);

        Rectangle rectangle1 = new Rectangle(5,6);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle("orange", true, 6, 8);
        System.out.println(rectangle2);
        System.out.println(rectangle1.getPerimeter());

        Square square1 = new Square(4);
        System.out.println(square1);
    }
}
