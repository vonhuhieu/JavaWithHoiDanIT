package ExcercisesAboutInput_Output_Math_Function;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập điểm sinh viên: ");
        double score = scanner.nextDouble();
        System.out.println(name + " có điểm = " + score);
        scanner.close();
    }
}
