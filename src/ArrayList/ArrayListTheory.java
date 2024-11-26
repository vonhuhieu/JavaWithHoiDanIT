package ArrayList;

import java.util.ArrayList;

public class ArrayListTheory {
    public static void main(String[] args) {
        int a = 10;
        // dùng generic để khi không thêm đúng kiểu dữ liệu sẽ tự động báo lỗi
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Hỏi dân IT");
        a1.add("Hỏi dân IT 2");
        a1.add("Hỏi dân IT 3");
        a1.remove(1);
        System.out.println(a1.toString() + " " + a1.get(1));
    }
}
