package human_manager;

import human_manager.model.Person;
import human_manager.model.Student;
import human_manager.model.Teacher;
import human_manager.service.impl.PersonServiceImpl;
import human_manager.service.impl.StudentServiceImpl;
import human_manager.service.impl.TeacherServiceImpl;

import java.util.Scanner;

public class PersonService {


    public static void main(String[] args) {
        PersonServiceImpl personService = new PersonServiceImpl();
        int choice = -1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Thêm người vào danh sách");
            System.out.println("2. In danh sách");
            System.out.println("3. Xóa học sinh trong danh sách");
            System.out.println("4. Sửa học sinh trong danh sách");
            System.out.println("5. Tìm kiếm học sinh theo tên");
            System.out.println("6. Sắp xếp danh sách theo điểm tăng dần");
            System.out.println("7. Sắp xếp danh sách theo điểm giảm dần");
            System.out.println("8. Tính tổng điểm");
            System.out.println("0. Kết thúc chương trình");
            System.out.println("Vui lòng lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int option = -1;
                    while (option != 0) {
                        System.out.println("Nhập tùy chọn: ");
                        System.out.println("1. Thêm học sinh");
                        System.out.println("2. Thêm giáo viên");
                        System.out.println("0. Hoạt động khác");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                personService.add(StudentServiceImpl.createStudent());
                                break;
                            case 2:
                                personService.add(TeacherServiceImpl.createTeacher());
                                break;
                            case 0:
                                System.exit(0);
                            default:
                                System.out.println("Không có tùy chọn!");
                        }
                    }
                    break;
                case 2:
                    personService.print();
                    break;
                case 3:
                    System.out.print("Nhập id của học sinh cần xóa: ");
                    int deleteId = scanner.nextInt();
                    personService.deleteById(deleteId);
                    break;
                case 4:
                    System.out.print("Nhập id của học sinh cần sửa: ");
                    int editId = scanner.nextInt();
                    if (personService.findIndexById(editId) != -1) {
                        Person.setId(editId - 1);
                        personService.editById(editId, TeacherServiceImpl.createTeacher());
                        Person.setMaxId(Student.getMaxId() - 1);
                        Person.setId(Student.getMaxId());

                    } else {
                        System.out.println("Không có học sinh tương ứng với id này.");
                    }
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.print("Nhập tên cần tìm kiếm: ");
                    String nameFind = scanner.nextLine();
                    personService.findByName(nameFind);
                    break;
//                case 6:
//                    studentService.sortIncrease();
//                    System.out.println("Danh sách đã được sắp xếp theo điểm tăng dần.");
//                    break;
//                case 7:
//                    studentService.sortDecrease();
//                    System.out.println("Danh sách đã được sắp xếp theo điểm giảm dần.");
//                    break;
//                case 8:
//                    System.out.println("Tổng điểm: " + studentService.sumScore());
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có tùy chọn!");
            }
        }
    }
}
