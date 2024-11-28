package DateTimeJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatetimeJavaTheory {
    public static void main(String[] args) {
        // muốn sử dụng tháng nhớ + thêm 1
        Calendar cal = Calendar.getInstance();
        // System.out.println(cal);

        // lấy ngày tháng năm
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH); // khi sử dụng nhớ + 1
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        // System.out.println("Hôm nay là ngày " + ngay + " tháng " + (thang + 1) + " năm " + nam);

        // đặt ngày, tháng năm theo ý muốn
        cal.set(Calendar.YEAR, 2003);
        cal.set(Calendar.MONTH, 2); // tháng chỉ chạy từ 0 đến 11, nên khi người dùng nhập, ta phải lấy giá trị đó trừ đi 1 rồi mới SET
        cal.set(Calendar.DAY_OF_MONTH, 4);
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        // System.out.println(cal);
        // System.out.println("Tôi sinh ngày " + ngaySinh + " thaáng " + (thangSinh + 1) + " năm " + namSinh);

        // xuất theo định dạng ngày tháng năm
        SimpleDateFormat timeFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a"); // a là buổi sáng hay chiều
        // Tạo đối tượng để get thời gian biến cal ( ngày tháng năm sinh )
        Date date = cal.getTime();
        System.out.println(date);
        // Chuyển đổi ngày thành chuỗi định dạng dd/MM/yyyy và in ra màn hình
        String formattedDate = timeFormat.format(date);
        System.out.println(formattedDate);
    }
}
