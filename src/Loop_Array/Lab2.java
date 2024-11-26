package Loop_Array;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên bất kì: ");
        int a = scanner.nextInt();
        System.out.println("Bảng cửu chương của số " + a);
        for (int i = 0; i <= 10; ++i) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
        scanner.close();
    }
}
