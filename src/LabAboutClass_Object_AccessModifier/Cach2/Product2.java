package LabAboutClass_Object_AccessModifier.Cach2;

public class Product2 {
    private String name;
    private double price;
    private double tax;
    public Product2(String name, double price, double tax){
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTaxPrice(){
        return this.tax * this.price;
    }
}
