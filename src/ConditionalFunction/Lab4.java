package ConditionalFunction;

import java.util.Scanner;

public class Lab4 {
    public static final Scanner scanner = new Scanner(System.in);

    public static void giaiphuongtrinhbacnhat() {
        System.out.println("Mời nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.println("Mời nhập số nguyên b: ");
        int b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.printf("Phương trình có nghiệm duy nhất là x = %.2f", -(double) b / a);
        }
    }

    public static void giaiphuongtrinhbachai() {
        System.out.println("Giải phương trình: ax^2 + bx + c = 0");
        System.out.println("Mời nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.println("Mời nhập số nguyên b: ");
        int b = scanner.nextInt();
        System.out.println("Mời nhập số nguyên c: ");
        int c = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.printf("Phương trình có nghiệm x = %.2f", -((double) c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                if (delta == 0) {
                    System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f", -((double) b / (2 * a)));
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.printf("Phương trình có 2 nghiệm phân biệt lần lượt là x1 = %.2f và x2 = %.2f", x1, x2);
                }
            }
        }
    }

    public static void tinhsotiendien() {
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
    }

    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        System.out.println("Mời chọn tính năng: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                giaiphuongtrinhbacnhat();
            }
            break;
            case 2: {
                giaiphuongtrinhbachai();
            }
            break;
            case 3: {
                tinhsotiendien();
            }
            break;
            case 4: {
                System.out.println("Bạn đã lựa chọn thoát chương trình");
                System.exit(0);
            }
            break;
            default: {
                System.out.println("Lựa chọn không hợp lệ");
                System.exit(0);
            }
        }
        scanner.close();
    }
}
