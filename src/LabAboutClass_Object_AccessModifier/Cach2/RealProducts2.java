package LabAboutClass_Object_AccessModifier.Cach2;

import java.util.Scanner;

public class RealProducts2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        System.out.println("Mời nhập thuế sản phẩm: ");
        double tax = scanner.nextDouble();
        Product2 newProduct = new Product2(name, price, tax);
        System.out.println("Tên sản phẩm: " + newProduct.getName());
        System.out.println("Giá sản phẩm: $" + newProduct.getPrice());
        System.out.println("Thuế: $" + newProduct.getTaxPrice());
        scanner.close();
    }
}
