package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab {
    public static final Scanner scanner = new Scanner(System.in);

    public static void validateCCCD() {
        System.out.println("Moi nhap cccd: ");
        String cccd = scanner.nextLine();
        Pattern pattern = Pattern.compile("^\\d{12}$");
        Matcher matcher = pattern.matcher(cccd);
        if (matcher.matches()) {
            System.out.println("CCCD hợp lệ");
        } else {
            System.out.println("CCCD không hợp lệ");
        }
    }

    public static void validatePassword() {
        System.out.println("Mời nhập mật khẩu: ");
        String password = scanner.nextLine();
        Pattern pattern = Pattern.compile("^.{6,}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("password hợp lệ");
        } else {
            System.out.println("password không hợp lệ");
        }
    }

    public static void validateEmail() {
        System.out.println("Mời nhập email: ");
        String email = scanner.nextLine();
        Pattern pattern = Pattern.compile("^(?=.*@)(?=.*\\.).*$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("email hợp lệ");
        } else {
            System.out.println("Không hợp lệ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Mời lựa chọn tính năng: ");
        System.out.println("1. Kiểm tra căn cước công dân: ");
        System.out.println("2. Kiểm tra mat khẩu: ");
        System.out.println("3. Kiểm tra email");
        int choosen = scanner.nextInt();
        scanner.nextLine();
        switch (choosen) {
            case 1:
                validateCCCD();
                break;
            case 2:
                validatePassword();
                break;
            case 3:
                validateEmail();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                System.exit(0);
        }
        scanner.close();
    }
}
