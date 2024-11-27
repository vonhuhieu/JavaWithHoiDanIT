package KeywordFinally.Lab;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Mời nhập MSSV: ");
                String maSV = scanner.nextLine();
                System.out.println("Mời nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Mời nhập điểm: ");
                double diem = scanner.nextDouble();
                System.out.println("Mời nhập tuổi: ");
                int age = scanner.nextInt();
                if((diem > 0 && diem < 10) && (age > 18 && age < 100)){
                    SinhVien newSV = new SinhVien(maSV, name, diem, age);
                    System.out.println(newSV);
                    break;
                }
                else {
                    System.out.println("Dữ liệu nhập không hợp lệ. Xin kiểm tra lại");
                    System.out.println("Đểm phải từ 0 đến 10");
                    System.out.println("Tuổi phải lớn hơn 18 và nhỏ hơn 100");
                }
            } catch (Exception e) {
                scanner.next();
                System.out.println("Kiểm tra dữ liệu nhập vào có hợp lệ hay không?");
                System.out.println("MSSV phải nhập một chuỗi");
                System.out.println("Tên phải nhập một chuỗi");
                System.out.println("Điểm phải là số thực");
                System.out.println("Tuổi phải là số nguyên");
            }
            finally {
                scanner.close();
            }
        }
    }
}
