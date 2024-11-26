package String;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập username: ");
        String username = scanner.nextLine();
        // nextline() chỉ dùng khi ở trên khác kiểu, còn cùng string thì thooi
        System.out.println("Mời nhập mật khẩu: ");
        String password = scanner.nextLine();
        // trong java khi dùng String phải di với equals vì là object, username == là sai
        if (username.equals("hoidanit") && password.length() > 6) {
            System.out.println("Hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }
        scanner.close();
    }
}
