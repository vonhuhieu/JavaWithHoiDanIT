package CollectionJava;

import java.util.HashMap;

public class HashMapTheory {
    public static void main(String[] args) {
        // khai báo
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<Integer, Float> map2 = new HashMap<>();

        // thêm các phần tử vào HashMap
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "cherry");

        // lấy giá trị của mot phan tu
        String value = map.get(1);
        System.out.println(value);

        // xóa phần tử khoi HashMap
        map.remove(2);
        System.out.println(map);

        // kiểm tra một phần tử có tồn tại trong HashMap hay không
        boolean check = map.containsKey(4);
        System.out.println(check);

        // kiểm tra xem một giá trị có tồn tại trong HashMap hay không
        boolean checkValue = map.containsValue("apple");
        System.out.println(checkValue);

        // kiểm tra xem HashMap có rong hay không
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);

        // lấy số lượng phần tử
        int soLuongPT = map.size();
        System.out.println(soLuongPT);

        // duyệt HashMap
        for (Integer key : map.keySet()) {
            String vl = map.get(key);
            System.out.println(vl);
        }
    }
}
