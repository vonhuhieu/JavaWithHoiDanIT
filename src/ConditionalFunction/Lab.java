package ConditionalFunction;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ------------------ ++");
        System.out.println("| 1. Cộng |");
        System.out.println("| 2. Trừ |");
        System.out.println("| 3. Kết thúc |");
        System.out.println("++ ------------------ ++");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lựa chọn của bạn là : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Bạn đã lựa chọn phép cộng");
            }
            break;
            case 2: {
                System.out.println("Bạn đã lựa chọn phép trừ");
            }
            break;
            case 3: {
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
