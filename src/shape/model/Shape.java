package shape.model;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "blue";
        filled = true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape {" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}