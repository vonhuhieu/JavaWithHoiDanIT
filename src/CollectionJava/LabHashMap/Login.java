package CollectionJava.LabHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        User user1 = new User("Võ Như Hiếu", "1");
        User user2 = new User("Vi Vy", "1");
        HashMap<String, String> list = new HashMap<>();
        list.put(user1.getUsername(), user1.getPassword());
        list.put(user2.getUsername(), user2.getPassword());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Mời nhập password: ");
        String password = scanner.nextLine();
        if (list.containsKey(username)) {
            if (list.containsValue(password)) {
                System.out.println("Login thành công");
            } else {
                System.out.println("Login thất bại");
            }
        } else {
            System.out.println("User name không tồn tại");
        }
    }
}
