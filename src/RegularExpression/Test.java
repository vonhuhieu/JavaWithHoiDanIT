package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static boolean validateCCCD(String cccd) {
        Pattern pattern = Pattern.compile("^\\d{12}$");
        Matcher matcher = pattern.matcher(cccd);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("^.{6,}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public static boolean validateEmail(String email){
        Pattern pattern = Pattern.compile("^(?=.*@)(?=.*\\.).*$");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Mời nhập cccd: ");
//        String cccd = scanner.nextLine();
//        if (validateCCCD(cccd)) {
//            System.out.println("Hợp lệ");
//        } else {
//            System.out.println("Không hợp lệ");
//        }
//        System.out.println("Mời nhập mật khẩu: ");
//        String password = scanner.nextLine();
//        if (validatePassword(password)) {
//            System.out.println("Hợp lệ");
//        } else {
//            System.out.println("Không hợp lệ");
//        }
        System.out.println("Moi nhap email: ");
        String email = scanner.nextLine();
        if(validateEmail(email)){
            System.out.println("Hợp lệ");
        }
        else {
            System.out.println("Không hợp lệ");
        }
        scanner.close();
    }
}
