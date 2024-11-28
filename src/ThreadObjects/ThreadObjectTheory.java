package ThreadObjects;

import java.io.IOException;

public class ThreadObjectTheory extends Thread{
    @Override
    public void run() {
        System.out.println("start thread");
        long sum = 0L;
        // i chạy từ 0 đến 10 tỷ và tính tổng
        // cho số lớn để máy tính tốn thời gian tí
        for (long i = 0L; i < 10000000000L; i++) {
            sum += i;
        }
        System.out.println(" end thread");

    }
    public static void main(String[] args) throws IOException {
        int MAX = 2; // lặp
        for (int i = 0; i < MAX; i++) {
            (new ThreadObjectTheory()).start();
        }
        System.out.println("finish");
    }
}
