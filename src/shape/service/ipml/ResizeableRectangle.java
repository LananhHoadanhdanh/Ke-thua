package shape.service.ipml;

import shape.model.Rectangle;
import shape.service.Resizeable;

public class ResizeableRectangle extends Rectangle implements Resizeable {
    @Override
    public void resize(double percent) {
        setWidth(getWidth()*(1+percent/100));
        setHeight(getHeight()*(1+percent/100));
    }

    public ResizeableRectangle() {
    }

    public ResizeableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                ", area='" + getArea() + '\'' +
                ", perimeter=" + getPerimeter() +
                '}';
    }


    public static void main(String[] args) {
        ResizeableRectangle rectangle = new ResizeableRectangle(5,6);
        System.out.println(rectangle);
        rectangle.resize(100);
        System.out.println(rectangle);
    }
}
