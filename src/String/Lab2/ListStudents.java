package String.Lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class ListStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số lượng học sinh: ");
        int count = scanner.nextInt();
        ArrayList<Student> studentsList = new ArrayList<>();
        for (int i = 0; i < count; ++i) {
            System.out.println("Moi nhap id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Mời nhập tên học sinh: ");
            String name = scanner.nextLine();
            Student newStudent = new Student(name, id);
            studentsList.add(newStudent);
        }
        System.out.println("Danh sách học sinh: " + studentsList);
        System.out.println("Danh sách học sinh có họ Nguyễn: ");
        for (int i = 0; i < studentsList.size(); ++i) {
            // kiểm tra chuỗi bắt đầu bằng gì
            if(studentsList.get(i).getName().startsWith("Nguyễn")){
                System.out.println(studentsList.get(i));
            }
        }
        scanner.close();
    }
}
