package shape.service.ipml;

import shape.model.Square;
import shape.service.Resizeable;

public class ResizeableSquare extends Square implements Resizeable {

    @Override
    public void resize(double percent) {
        setSide(getSide()*(1+percent/100));
    }

    public ResizeableSquare() {
    }

    public ResizeableSquare(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public String toString() {
        return "Square {" +
                "side=" + getSide() +
                ", area='" + getArea() + '\'' +
                ", perimeter=" + getPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        ResizeableSquare square = new ResizeableSquare();
        System.out.println(square);
        square.resize(100);
        System.out.println(square);
    }
}
