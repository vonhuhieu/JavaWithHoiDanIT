import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // pow trả dữ liệu dưới dạng số thực
        double a = Math.pow(2, 6);
        System.out.println("Mời nhập số a: " + a);
        // int a = scanner.nextInt();
        double b = Math.sqrt(10000);
        System.out.println("Mời nhập số b: " + b);
        // int b = scanner.nextInt();
        double c = Math.min(a, b);
        System.out.println("Min = " + c);
        scanner.close();
    }
}
