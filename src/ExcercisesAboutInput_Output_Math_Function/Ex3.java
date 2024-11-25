package ExcercisesAboutInput_Output_Math_Function;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính thể tích hình lập phương");
        System.out.println("Mời nhập độ dài cạnh: ");
        double canh = scanner.nextDouble();
        double result = Math.pow(canh, 3);
        System.out.printf("Thể tích hình lập phương: %.2f", result);
        scanner.close();
    }
}
