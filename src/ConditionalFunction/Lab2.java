package ConditionalFunction;

import java.util.Scanner;

public class Lab2 {
    public static void giaiphuongtrinhbacnhat(int a, int b) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình: ax^2 + bx + c = 0");
        System.out.println("Mời nhập số nguyên a: ");
        int a = scanner.nextInt();
        System.out.println("Mời nhập số nguyên b: ");
        int b = scanner.nextInt();
        System.out.println("Mời nhập số nguyên c: ");
        int c = scanner.nextInt();
        if (a == 0) {
            giaiphuongtrinhbacnhat(b, c);
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
        scanner.close();
    }
}
