package Interface.Lab;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập id: ");
        String id = scanner.nextLine();
        System.out.println("Mời nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Mời nhập điểm");
        int mark = scanner.nextInt();
        Student newStudent = new Student(id, name, age, mark);
        newStudent.setGrade(mark);
        System.out.println("ID: " + newStudent.getId());
        System.out.println("Họ tên: " + newStudent.getName());
        System.out.println("Tuổi: " + newStudent.getAge());
        System.out.println("Điểm: " + newStudent.getMark());
        System.out.println("Xep loai: " + newStudent.getGrade());
    }
}
