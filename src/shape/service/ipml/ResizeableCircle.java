package shape.service.ipml;

import shape.model.Circle;
import shape.service.Resizeable;

public class ResizeableCircle extends Circle implements Resizeable {

    public ResizeableCircle(double radius) {
        super(radius);
    }

    public ResizeableCircle() {
    }

    public ResizeableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius()*(1+percent/100));
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + getRadius() +
                ", area=" + getArea() +
                '}';
    }

    public static void main(String[] args) {
        ResizeableCircle circle1 = new ResizeableCircle(5, "red", true);
        System.out.println(circle1);
        circle1.resize(50);
        System.out.println(circle1);
    }
}
