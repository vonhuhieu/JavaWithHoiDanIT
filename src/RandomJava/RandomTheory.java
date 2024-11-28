package RandomJava;

import java.util.Random;

public class RandomTheory {
    public static void main(String[] args) {
        // khởi tạo 1 đối tượng ngẫu nhin
        Random rd = new Random();

        // random 1 số nguyên ngẫu nhin
        int soNguyen = rd.nextInt( 0, 51); // chạy từ -50 đến < 51
        System.out.println(soNguyen);

        // random 1 số thực
        double x = rd.nextDouble(-100, 100);
        System.out.println(x);
    }
}
