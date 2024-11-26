package Class_Object;

public class Test {
    public static void main(String[] args) {
        Student sinhvien1 = new Student("Hiếu", 26);
        sinhvien1.setName("Võ Như Hiếu aka Gin");
        sinhvien1.setAge(21);
        System.out.println("check obj: " + sinhvien1.getName() + " and age = " + sinhvien1.getAge());
    }
}
