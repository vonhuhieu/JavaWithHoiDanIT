package Exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Mời nhập x: ");
            try {
                int x = scanner.nextInt();
                try {
                    System.out.println("Kết quả: " + 10 / x);
                    break;
                } catch (Exception e) {
                    System.out.println("errors with x = " + x);
                }
            } catch (Exception e) {
                scanner.next();
                System.out.println("errors because x is not integer");
            }
        }
        scanner.close();
    }
}
