package Class_Object;

public class Student {
    // class attributes
    private String name;
    private int age;

    // constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public String getName(){
//        return this.name;
//    }
//
//    public int getAge(){
//        return this.age;
//    }
//
//    public void setName(String name1){
//        this.name = name1;
//    }
    // để định nghĩa phương thức cần quan tâm kiểu giá trị trả về của nó
    public void displayInfo() {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
    }

    public static void main(String[] args) {
        // Phải có hàm tạo mới được khai báo như vậy
        Student sinhvien1 = new Student("Hiếu", 21);
        // Student sinhvien1 = new Student();
        sinhvien1.name = "Võ Như Hiếu";
        sinhvien1.age = 21;
        sinhvien1.displayInfo();
        Student sinhvien2 = new Student("Len", 22);
        System.out.println("check obj sinhvien2: " + sinhvien2.name + " and age = " + sinhvien2.age);
    }
}
