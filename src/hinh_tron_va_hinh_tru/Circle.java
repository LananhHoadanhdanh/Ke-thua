package hinh_tron_va_hinh_tru;

public class Circle {
    int radius;
    String color;

    public Circle() {
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return  this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
