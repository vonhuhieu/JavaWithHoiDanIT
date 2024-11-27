package Inheritance.SuperKeyword;

public class SinhVienCoKhi extends SinhVien{
    private String skill;

    public SinhVienCoKhi(int id, String name, double price, double tax, String skill) {
        super(id, name, price, tax);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    void tinhDiem() {

    }
}
