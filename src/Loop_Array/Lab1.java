package Loop_Array;

import java.util.Scanner;

public class Lab1 {
    public static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt((double) a); ++i) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiểm tra số nguyên tố");
        System.out.println("Mời nhập số nguyên bất kỳ: ");
        int a = scanner.nextInt();
        if (isPrime(a)) {
            System.out.println(a + " là số nguyên tố");
        } else {
            System.out.println(a + " không phải là số nguyên tố");
        }
        scanner.close();
    }
}
