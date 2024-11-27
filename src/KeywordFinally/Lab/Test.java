package KeywordFinally.Lab;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Mời nhập mã SV: ");
                String maSV = scanner.nextLine();
                System.out.println("Mời nhập tên SV: ");
                String name = scanner.nextLine();
                System.out.println("Mời nhập điểm sinh viên: ");
                double diem = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Mời nhập tuổi SV: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                if((diem > 0 && diem < 10) && (age > 18 && age < 100)){
                    SinhVien newSinhVien = new SinhVien(maSV, name, diem, age);
                    System.out.println(newSinhVien);
                    break;
                }
                else {
                    System.out.println("Kiểm tra du lieu nhập vào có hợp lệ");
                    System.out.println("Điểm phải lớn hơn 0 và nhỏ hơn 10");
                    System.out.println("Tuổi phải lon hon 18 và nhỏ hơn 100");
                }
            } catch (Exception e) {
                System.out.println("Kiểm tra xem dữ liệu nhập vào có hợp lệ");
                System.out.println("Điểm phải là số thực. Tuổi phải là số nguyên");
                scanner.nextLine();
            }
        }
    }
}
