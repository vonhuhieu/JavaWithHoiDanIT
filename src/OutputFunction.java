public class OutputFunction {
    public static void main(String[] args) {
        System.out.print("Hỏi Dân IT");
        System.out.println("với Eric");
        //  sử dụng System.out.printf để định dạng chuỗi:
        System.out.printf("có %.0f người đăng ký", 40000.55);

        // Bài tập ví dụ: Khai báo 2 biến name và age.
        // Sử dụng 3 hàm trên để in ra màn hình
        // My name is <name>, age= <age>
        System.out.print("\n");
        String name = "Hiếu";
        int age = 21;
        System.out.print("My name is " + name);
        System.out.printf(", age = %d", age);
    }
}
