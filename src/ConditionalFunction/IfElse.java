package ConditionalFunction;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        final int donViTienTe = 1000000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thông báo thuế");
        System.out.println("Nhập vào số tiền thuế: ");
        int tien = scanner.nextInt();
        if (tien < donViTienTe * 10) {
            System.out.println("Ko đóng thuế");
        } else if (tien >= donViTienTe * 10 && tien <= donViTienTe * 15) {
            System.out.println("Thuế 10%");
        } else if (tien > donViTienTe * 15 && tien <= donViTienTe * 30) {
            System.out.println("Thuế 20%");
        } else {
            System.out.println("Thuế 50%");
        }
        scanner.close();
    }
}
