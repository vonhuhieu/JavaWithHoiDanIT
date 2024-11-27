package Inheritance.Lab;

import java.util.Scanner;

public class TinhDiemTB {
    public static final Scanner scanner = new Scanner(System.in);

    public static void SinhVienIT() {
        System.out.println("Mời nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mời nhập họ tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập điểm java: ");
        double scoreJava = scanner.nextDouble();
        System.out.println("Mời nhập điểm html: ");
        double scoreHTML = scanner.nextDouble();
        SinhVien diemTBSinhVienIT = new SinhVienIT(id, name, scoreJava, scoreHTML);
        System.out.println("ID: " + diemTBSinhVienIT.id);
        System.out.println("Name: " + diemTBSinhVienIT.name);
        diemTBSinhVienIT.getDiem();
    }

    public static void SinhVienCoKhi() {
        System.out.println("Mời nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mời nhập họ tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập điểm CNC: ");
        double scoreCNC = scanner.nextDouble();
        System.out.println("Mời nhập điểm LPC: ");
        double scoreLPC = scanner.nextDouble();
        SinhVien diemTBSinhVienCoKhi = new SinhVienCoKhi(id, name, scoreCNC, scoreLPC);
        System.out.println("ID: " + diemTBSinhVienCoKhi.id);
        System.out.println("Name: " + diemTBSinhVienCoKhi.name);
        // dùng biến có kiểm dữ liệu SinhVien là kiểu dữ liệu tham chiếu để gọi phương thức getDiem() -> tính đa hình
        diemTBSinhVienCoKhi.getDiem();
    }

    public static void main(String[] args) {
        System.out.println("Bạn muốn tính điểm sinh viên nào?");
        System.out.println("1.Sinh viên IT");
        System.out.println("2.Sinh viên cơ khí");
        int choosen = scanner.nextInt();
        switch (choosen) {
            case 1:
                SinhVienIT();
                break;
            case 2:
                SinhVienCoKhi();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                System.exit(0);
        }
    }
}
