package human_manager.service.impl;

import human_manager.model.Student;
import human_manager.model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherServiceImpl extends PersonServiceImpl{
    ArrayList<Teacher> teacherList;

    public TeacherServiceImpl() {
        teacherList = new ArrayList<>();
    }
    public static Teacher createTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập môn học: ");
        String subject = scanner.nextLine();
        return new Teacher(name, age, subject);
    }
}
