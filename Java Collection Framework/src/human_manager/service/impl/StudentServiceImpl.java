package human_manager.service.impl;

import human_manager.model.Student;
import human_manager.service.GeneralService;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentServiceImpl extends PersonServiceImpl {
    private ArrayList<Student> studentList;

    public StudentServiceImpl() {
        this.studentList = new ArrayList<>();
    }

    public void sortIncrease() {
        studentList.sort((p1, p2) -> p1.getAverageScore() - p2.getAverageScore());
    }

    public void sortDecrease() {
        studentList.sort((p1, p2) -> p2.getAverageScore() - p1.getAverageScore());
    }

    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        int averageScore = scanner.nextInt();
        return new Student(name, age, averageScore);
    }

    public int sumScore() {
        int sumScore = 0;
        for (int i = 0; i < studentList.size(); i++) {
            sumScore+= studentList.get(i).getAverageScore();
        }
        return sumScore;
    }
}
