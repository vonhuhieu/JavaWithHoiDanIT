package Loop_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_AnotherMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào số phần tử của mảng: ");
        int count = scanner.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; ++i) {
            System.out.println("Mời nhập giá trị phần tử thứ " + (i + 1));
            a[i] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(a));
        System.out.println("Giá trị phần tử nhỏ nhất: " + a[0]);
        System.out.println("Giá trị phần tử lớn nhất: " + a[count - 1]);
        scanner.close();
    }
}
