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
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "Square{" + "side='" + getSide() + '\'' +
                ", which is a subclass of " +
                "color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                '}';
    }
}
