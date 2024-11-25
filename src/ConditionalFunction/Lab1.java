package ConditionalFunction;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("Giải phương trình: ax + b = 0");
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }
}
