package triangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh đầu tiên: ");
        double side1 = scanner.nextDouble();
        System.out.println("Nhập cạnh thứ 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Nhập cạnh thứ 3: ");
        double side3 = scanner.nextDouble();
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Đây không phải 3 cạnh của một tam giác.");
        } else {
            if (side1 + side2 > side3 && side1 + side3 > side2 && side3 + side2 > side1) {
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("Nhập màu sắc của tam giác: ");
                scanner.nextLine();
                String color = scanner.nextLine();
                triangle.setColor(color);
                System.out.println(triangle);
            } else {
                System.out.println("Đây không phải 3 cạnh của một tam giác");
            }
        }
    }
}
