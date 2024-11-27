package Inheritance.SuperKeyword;

public class TestInheritance {
    public static void main(String[] args) {
        SinhVienIT st1 = new SinhVienIT(123, "eric", 10, 0.1, "java");
        System.out.println("check: " + st1.id);

        SinhVienCoKhi st2 = new SinhVienCoKhi(124, "Hiếu", 10, 10, "guitar");
        System.out.println("check svck: " + st2.getSkill());
    }
}
