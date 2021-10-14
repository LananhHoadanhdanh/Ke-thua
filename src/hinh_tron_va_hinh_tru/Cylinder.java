package hinh_tron_va_hinh_tru;

public class Cylinder extends Circle{
    private int height;
    public Cylinder() {

    }

    public Cylinder(int height) {
        this.height = height;
    }

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder {" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
