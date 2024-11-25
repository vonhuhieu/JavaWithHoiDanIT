package ConditionalFunction;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính số điện");
        System.out.println("Mời nhập số điện: ");
        int value = scanner.nextInt();
        int tien;
        if (value <= 100) {
            tien = value * 1000;
        } else {
            tien = 100 * 1000 + (value - 100) * 1500;
        }
        System.out.println("Tiền điện của bạn: " + tien);
        scanner.close();
    }
}
