package shape.service.ipml;

import shape.model.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCircle extends Circle implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }

    public ComparatorCircle() {
    }

    public ComparatorCircle(double radius) {
        super(radius);
    }

    public ComparatorCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        ComparatorCircle circleComparator = new ComparatorCircle();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
