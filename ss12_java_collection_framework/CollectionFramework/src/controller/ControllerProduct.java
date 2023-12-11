package controller;
import service.ServiceProduct;

import java.util.Scanner;

public class ControllerProduct {
    public static void displayMenu() {
        ServiceProduct serviceProduct = new ServiceProduct();
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("--Menu--" +
                    "\n0.Thoát" +
                    "\n1.Hiển thị danh sách sản phẩm" +
                    "\n2.Thêm sản phẩm" +
                    "\n3.Nhập id sản phẩm cần sửa" +
                    "\n4.Nhập id sản phẩm cần xóa" +
                    "\n5.Tìm kiếm sản phẩm" +
                    "\n6.Sắp xếp sản phẩm");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 0:
                    System.out.println("Kết thúc chương trình");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Danh sách sản phẩm");
                    serviceProduct.displayProductList();
                    break;
                case 2:
                    System.out.println("Thêm sản phẩm");
                    serviceProduct.addProduct();
                    break;
                case 3:
                    System.out.println("Sửa sản phẩm");
                    serviceProduct.updateProduct();
                    break;
                case 4:
                    System.out.println("Xóa sản phẩm");
                    serviceProduct.deleteProduct();
                    break;
                case 5:
                    System.out.println("Tìm kiếm sản phẩm");
                    serviceProduct.searchProduct();
                    break;
                case 6:
                    System.out.println("Sắp xếp sản phẩm");
                    serviceProduct.sortingProduct();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    //throw new IllegalAccessException("Unexpected value: " + choice);
            }
        }
    }
}
