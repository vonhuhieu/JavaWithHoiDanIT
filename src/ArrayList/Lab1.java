package ArrayList;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList();
        while (true) {
            System.out.println("Mời nhập số thực: ");
            Double x = scanner.nextDouble();
            arr.add(x);
            scanner.nextLine(); // xoas kys tu enter
            System.out.println("Bạn có muốn nhập tiếp không? Y/N");
            // equalsIgnoreCase để khỏi phân biệt chữ hoa hay chữ thường
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Mảng đã nhập: " + arr.toString());
        double sum = 0;
        for (int i = 0; i < arr.size(); ++i){
            sum += arr.get(i);
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
