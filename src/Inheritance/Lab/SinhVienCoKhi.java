package Inheritance.Lab;

public class SinhVienCoKhi extends SinhVien {
    private double scoreCNC;
    private double scoreLPC;

    public SinhVienCoKhi(int id, String name, double scoreCNC, double scoreLPC) {
        super(id, name);
        this.scoreCNC = scoreCNC;
        this.scoreLPC = scoreLPC;
    }

    @Override
    void getDiem() {
        double diemTB = (this.scoreCNC + this.scoreLPC) / 2;
        System.out.printf("Điểm trung bình: %.2f", diemTB);
    }
}
