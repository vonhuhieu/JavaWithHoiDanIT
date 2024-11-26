package LabAboutClass_Object_AccessModifier.Cach1;

public class Product {
    private String name;
    private double price;
    private double tax;

//    public Product(String name, double price, double tax) {
//        this.name = name;
//        this.price = price;
//        this.tax = tax;
//    }

    public void nhapThongtin(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public void xuatThongtin() {
        System.out.println("Tên sản phẩm: " + this.name);
        System.out.println("Giá sản phẩm: $" + this.price);
        System.out.println("Thuế: $" + getTaxPrice());
    }

    public double getTaxPrice(){
        return this.price * this.tax;
    }
}
