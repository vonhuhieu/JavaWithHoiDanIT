package KeywordFinally;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Mời nhập x");
            int x = scanner.nextInt();
            System.out.println("run try");
        } catch (Exception e) {
            System.out.println("run catch");
        } finally {
            System.out.println("run finally");
            scanner.close();
        }
    }
}
