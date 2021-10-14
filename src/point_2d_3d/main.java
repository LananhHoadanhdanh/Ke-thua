package point_2d_3d;

public class main {
    public static void main(String[] args) {
        Point2D point2D1 = new Point2D();
        Point2D point2D2 = new Point2D(5,10);
        System.out.println(point2D1);
        System.out.println(point2D2);
        point2D1.setXY(10,15);
        System.out.println(point2D1);

        Point3D point3D1 = new Point3D(6,7,8);
        Point3D point3D2 = new Point3D();
        point3D2.setXYZ(20, 30, 40);
        System.out.println(point3D1);
        System.out.println(point3D2);
    }
}
