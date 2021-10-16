package hinh_tron_va_hinh_tru;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5, "red");
        System.out.println(circle1);
        System.out.println("Chu vi: " + circle1.getPerimeter());

        Cylinder cylinder1 = new Cylinder(7, "red", 5);
        System.out.println(cylinder1);
    }
}
