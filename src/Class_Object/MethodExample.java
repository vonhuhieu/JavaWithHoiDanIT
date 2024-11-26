package Class_Object;

public class MethodExample {
    int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {

        // đối tượng test được tạo ra tuwf class MethodExample
        MethodExample test = new MethodExample();
        int a = test.sum(6, 9);
        System.out.println("Test: " + a);
    }
}
