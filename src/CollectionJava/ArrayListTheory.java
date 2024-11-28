package CollectionJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListTheory {
    public static void main(String[] args) {
        // khai báo list
        ArrayList<Integer> list = new ArrayList<>();

        // khai báo với số lượng phần tử ban đầu
        ArrayList<Integer> list2 = new ArrayList<>(5);

        // Khởi tạo list với các phần tử ban đầu
        ArrayList<Integer> list3 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

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
        ArrayList<Integer> list5 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        list5.remove(Integer.valueOf(4));
        System.out.println("List 5 lúc này: " + list5);

        // set(index, element): thay đổi thông tin
        ArrayList<Integer> list6 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        list6.set(1, 4);
        System.out.println("list6 sau sửa: " + list6);

        // contains(): Kiểm tra collection có chứa phần tử nào đó hay không
        ArrayList<Integer> list7 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        boolean kiemtra = list7.contains(1);
        System.out.println(kiemtra);

        // Collections.sort(list): SX tăng dần
        ArrayList<Integer> list8 = new ArrayList<>(List.of(19, 2, 30, 4, 5, 6));
        Collections.sort(list8);
        System.out.println("list8 sau sắp xếp: " + list8);

        // indexOf(): Tìm vị trí đầu tiên của element trong list
        // nếu không tồn tại trả về -1
        ArrayList<Integer> list9 = new ArrayList<>(List.of(19, 2, 30, 4, 5, 6));
        System.out.println(list9.indexOf(4));

        // duyệt list
        // cách 1
        ArrayList<Integer> list10 = new ArrayList<>(List.of(19, 2, 30, 4, 5, 6));
        for (int value : list10) {
            System.out.println(value);
        }

        // cách 2: khi cần sử dụng đến các chỉ số index
        ArrayList<Integer> list11 = new ArrayList<>(List.of(19, 2, 30, 4, 5, 6));
        for (int i = 0; i < list11.size(); ++i){
            int value = list11.get(i);
            System.out.println(value);
        }
    }
}
