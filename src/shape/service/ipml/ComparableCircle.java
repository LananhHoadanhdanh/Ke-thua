package shape.service.ipml;

import shape.model.Circle;
import java.util.Arrays;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public static void main(String[] args) {
        ComparableCircle[] circleList = new ComparableCircle[3];
        circleList[0] = new ComparableCircle(3);
        circleList[1] = new ComparableCircle();
        circleList[2] = new ComparableCircle(4, "indigo", false);

        System.out.println("Danh sách cũ: ");
        for (int i = 0; i < circleList.length; i++) {
            System.out.println(circleList[i]);
        }
        System.out.println("_______________________________________");

        Arrays.sort(circleList);

        System.out.println("Danh sách mới: ");
        for (int i = 0; i < circleList.length; i++) {
            System.out.println(circleList[i]);
        }

    }
}