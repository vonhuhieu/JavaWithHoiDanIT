package LabAboutClass_Object_AccessModifier.Cach1;

import java.util.Scanner;

public class RealProducts {
    public static void main(String[] args) {
        /* Product obj1 = new Product("guitar", 1000, 0.1);
        System.out.println("Tên sản phẩm: " + obj1.name);
        System.out.println("Giá: $" + obj1.price);
        System.out.println("Thuế: $" + obj1.getTaxPrice(obj1.price, obj1.tax));

        Product obj2 = new Product("bass", 800, 0.2);
        System.out.println("Tên sản phẩm: " + obj2.name);
        System.out.println("Giá: $" + obj2.price);
        System.out.println("Thuế: $" + obj1.getTaxPrice(obj2.price, obj2.tax));
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Mời nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        System.out.println("Mời nhập thuế sản phẩm: ");
        double tax = scanner.nextDouble();
        Product obj = new Product();
        obj.nhapThongtin(name, price, tax);
        obj.xuatThongtin();
        scanner.close();
    }
}
