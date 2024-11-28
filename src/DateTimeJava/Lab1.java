package DateTimeJava;

import java.util.Calendar;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        // laays ngày tháng năm hiện tại
        int namhientai = cal.get(Calendar.YEAR);
        int thanghientai = cal.get(Calendar.MONTH);
        thanghientai += 1;
        int ngayhientai = cal.get(Calendar.DAY_OF_MONTH);

        // nhập vào ngày tháng năm sinh
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập ngày sinh: ");
        int ngaysinh = scanner.nextInt();
        System.out.println("Mời nhập tháng sinh: ");
        int thangsinh = scanner.nextInt();
        System.out.println("Mời nhập năm sinh: ");
        int namsinh = scanner.nextInt();

        // in ra tuổi
        int tuoi = namhientai - namsinh;

        System.out.println("Năm nay bạn " + tuoi + " tuổi");
    }
}
