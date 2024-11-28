package CollectionJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTheory {
    public static void main(String[] args) {
        // khai báo list
        ArrayList<Integer> list = new ArrayList<>();

        // khai báo với số lượng phần tử ban đầu
        ArrayList<Integer> list2 = new ArrayList<>(5);

        // Khởi tạo list với các phần tử ban đầu
        ArrayList<Integer> list3 = new ArrayList<>(List.of(1, 2, 3 ,4, 5, 6));

        // xuất list
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);

        // add thêm phần ử
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(13);
        list4.add(2);
        list4.add(2002);
        System.out.println("List 4 add: " + list4);

        // add(index, element) vào vị trí chỉ định
        list4.add(1, 4);
        System.out.println("list 4 add: " + list4);

        // size: trả về số phần tử của list
        System.out.println("Số phần tử của list 4: " + list4.size());

        // get(int index) : trả về giá trị list tại vị trí index
        System.out.println(list4.get(0));

        // remove(index)
        list4.remove(1);
        System.out.println("List 4 lúc này: " + list4);

        // remove 1 phần tử được chỉ định
        ArrayList<Integer> list5 = new ArrayList<>(List.of(1, 2, 3 ,4, 5, 6));
        list5.remove(Integer.valueOf(4));
        System.out.println("List 5 lúc này: " + list5);

        // set(index, element): thay đổi thông tin
        ArrayList<Integer> list6 = new ArrayList<>(List.of(1, 2, 3 ,4, 5, 6));
        list6.set(1, 4);
        System.out.println("list6 sau sửa: " + list6);
    }
}
