package ExcercisesAboutInput_Output_Math_Function;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính diện tích hình chữ nhật");
        System.out.println("Mời nhập cạnh I: ");
        double canhI = scanner.nextDouble();
        System.out.println("Mời nhập cạnh II: ");
        double canhII = scanner.nextDouble();
        double S = canhI * canhII;
        double P = (canhI + canhII) * 2;
        double canhnhonhat = Math.min(canhI, canhII);
        System.out.printf("Diện tích hình chữ nhật: %.2f", S);
        System.out.print("\n");
        System.out.printf("Chiều rộng: %.2f", canhnhonhat);
        System.out.print("\n");
        System.out.printf("Chu vi: %.2f", P);
        scanner.close();
    }
}
