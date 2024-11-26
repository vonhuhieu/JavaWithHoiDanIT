package Loop_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào số phần tử của mảng: ");
        int count = scanner.nextInt();
        int[] a = new int[count];
        // phải nhập phần tử đầu tiên trước để gán giá trị cho max và min
        System.out.println("Mời nhập giá trị của phần tử đầu tiên: ");
        a[0] = scanner.nextInt();
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < count; ++i) {
            System.out.println("Mời nhập giá trị cho phần tử thứ " + (i + 1));
            a[i] = scanner.nextInt();
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Mảng vừa nhập: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(a));
        System.out.println("Giá trị phần tử nhỏ nhất: " + min);
        System.out.println("Giá trị phần tử lớn nhất: " + max);
        scanner.close();
    }
}
