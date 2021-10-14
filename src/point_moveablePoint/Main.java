package point_moveablePoint;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(5,6,7,8);
        System.out.println(movablePoint1);
        movablePoint1.move();
        System.out.println(movablePoint1);
    }
}
