package shape.model;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        setHeight(side);
        setWidth(side);
    }
    public double getSide() {
        return getWidth();
    }

    @Override
    public double getArea() {
        return getSide()*getSide();
    }

    @Override
    public double getPerimeter() {
        return getSide()*4;
    }

    @Override
    public String toString() {
        return "Square {" + "side='" + getSide() + '\'' +
                ", which is a subclass of " +
                "color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                '}';
    }
}
