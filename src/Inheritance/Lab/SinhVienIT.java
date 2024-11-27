package Inheritance.Lab;

public class SinhVienIT extends SinhVien {
    private double scoreJava;
    private double scoreHTML;

    public SinhVienIT(int id, String name, double scoreJava, double scoreHTML) {
        super(id, name);
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    @Override
    void getDiem() {
        double diemTB = (this.scoreJava * 2 + this.scoreHTML) / 3;
        System.out.printf("Điểm trung bình: %.2f", diemTB);
    }
}
