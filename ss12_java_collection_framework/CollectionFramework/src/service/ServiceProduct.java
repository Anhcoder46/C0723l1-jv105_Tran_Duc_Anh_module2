package service;

import module.Product;
import repository.Database;
import repository.IDatabase;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceProduct implements IServiceProduct {
    private IDatabase database = new Database();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.println("Nhập tên: ");
        String newName = sc.nextLine();
        System.out.println("Nhập id: ");
        int newID = sc.nextInt();
        System.out.println("Nhập giá: ");
        int newPrice = sc.nextInt();

        Product newproduct = new Product(newName, newID, newPrice);
        database.addProduct(newproduct);
    }

    @Override
    public void updateProduct() {
        System.out.println("Nhập id mà bạn muốn sửa: ");
        int idEdit = sc.nextInt();
        database.updateProduct(idEdit);
    }

    @Override
    public void displayProductList() {
        ArrayList<Product> list = database.getProductList();
        for (Product product : list) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
        System.out.println("Bạn muốn tìm kiếm sản phâm nào?");
        // sc.nextLine();
        String keyWord = sc.nextLine();
        database.searchProduct(keyWord);
    }

    @Override
    public void deleteProduct() {
        System.out.println("Enter the product ID you want to delete: ");
        int idEdit = sc.nextInt();
        database.deleteProduct(idEdit);;
    }

    @Override
    public void sortingProduct() {
        int ichoice;
        do {
            System.out.println("1.Tăng dần" +
                    "\n2.Giảm dần" +
                    "\n3.Nhập lựa chọn của bạn");
            ichoice = sc.nextInt();
            if (ichoice < 1 || ichoice > 2) {
                System.out.println("Nhập lựa chọn của bạn: ");
            }
        } while (ichoice < 1 || ichoice > 2);
        database.sortingProduct(ichoice);
    }
}
