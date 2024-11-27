package KeywordFinally.Lab;

public class SinhVien {
    private String maSV;
    private String name;
    private double diem;
    private int age;

    public SinhVien(String maSV, String name, double diem, int age) {
        this.maSV = maSV;
        this.name = name;
        this.diem = diem;
        this.age = age;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", name='" + name + '\'' +
                ", diem=" + diem +
                ", age=" + age +
                '}';
    }
}
