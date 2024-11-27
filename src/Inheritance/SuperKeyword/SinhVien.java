package Inheritance.SuperKeyword;

public abstract class SinhVien {
    protected int id;
    protected String name;
    protected double price;
    protected double tax;

    abstract void tinhDiem();

    public SinhVien(int id, String name, double price, double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public double getPriceTax(){
        return this.price * this.tax;
    }

    public void info(){
        System.out.println("run info from parent");
    }
}
