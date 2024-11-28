package CollectionJava.Lab;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        while (true) {
            System.out.println("Mời nhập số lượng phần tử: ");
            try {
                int n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("n phải là số nguyên lớn hơn 0");
                } else {
                    ArrayList<Double> list = new ArrayList<>();
                    for (int i = 0; i < n; ++i) {
                        list.add(rd.nextDouble(1, 100));
                    }
                    System.out.println("List vừa tạo: " + list);
                    scanner.close();
                    break;
                }
            } catch (Exception e) {
                System.out.println("n nhập vào phải là soos nguyên lớn hơn 0");
                scanner.nextLine();
            }
        }
    }
}
