package CollectionJava.Lab;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2 {
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
                        double x = rd.nextDouble(1, 100);
                        list.add(x);
                    }
                    System.out.println("List vừa tạo: " + list);
                    ArrayList<Double> newList = new ArrayList<>();
                    for (int i = 0; i < list.size(); ++i){
                        double value = Math.pow(list.get(i), (double) 2);
                        newList.add(value);
                    }
                    System.out.println("List sau khi binh phuong: " + newList);
                    int count = 0;
                    for (int i = 0; i < newList.size(); ++i){
                        if(newList.get(i) > 50){
                            count += 1;
                        }
                    }
                    System.out.println("Số phần tử lớn hơn 50 của list mới: " + count);
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
