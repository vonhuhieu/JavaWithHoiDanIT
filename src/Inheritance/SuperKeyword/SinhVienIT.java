package Inheritance.SuperKeyword;

public class SinhVienIT extends SinhVien{
    private String language;

    public SinhVienIT(int id, String name, double price, double tax, String language){
        super(id, name, price, tax);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void getMoney(){
        System.out.println("run get money");
        // phân biệt super với this, super luôn gọi lên cha, còn this chỉ trong phạm vi Class hiện tại
        this.info();
    }

    @Override
    void tinhDiem() {

    }

    public void info(){
        System.out.println("Run into from sinhvienIT");
    }
}
