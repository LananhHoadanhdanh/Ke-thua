package shape.service.ipml;

import shape.model.Circle;
import shape.model.Shape;
import shape.model.Square;
import shape.service.Colorable;

public class ColorableCircle extends Circle implements Colorable<ColorableCircle> {
    @Override
    public boolean howToColor() {
        System.out.println("Color all four sides");
        return false;
    }

    public ColorableCircle() {
    }

    public ColorableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ResizeableRectangle rectangle = new ResizeableRectangle("red", true, 3, 4);
        ColorableCircle circle = new ColorableCircle(5, "orange", false);
        Square square = new Square("yellow", true, 6);
        Shape[] shapeList = {rectangle, circle, square};
        System.out.println("Mảng hình cũ: ");
        for (int i = 0; i < shapeList.length; i++) {
            System.out.println(shapeList[i]);
        }
        System.out.println("__________________________________");

        for (int i = 0; i < shapeList.length; i++) {
            if(shapeList[i] instanceof Colorable) {
                ((Colorable<?>) shapeList[i]).howToColor();
                System.out.println(shapeList[i]);
            }
        }
    }
}
