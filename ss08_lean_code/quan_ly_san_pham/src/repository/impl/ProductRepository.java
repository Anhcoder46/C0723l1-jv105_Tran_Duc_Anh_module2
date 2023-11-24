package repository.impl;

import model.Product;
import repository.IProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Trần Đức Anh", 16,"Good"));
        productList.add(new Product(2, "Nguyễn Văn A", 6,"Good"));
        productList.add(new Product(3, "Trương Thị H", 20,"Good"));
    }

    @Override
    public ArrayList<Product> getList() {
        return productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    public void updateById(int id) {
        boolean flag = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i) != null && productList.get(i).getId() == id) {
                flag = true;
                System.out.println("Đã tìm thấy sản phẩm!!!");
                System.out.println("1. Sửa tên sản phẩm" +
                        "\n2. Sửa giá sản phẩm" +
                        "\n3. Sửa mô tả sản phẩm");
                System.out.println("Mời bạn chọn: ");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1: {
                        System.out.println("Tên mới: ");
                        productList.get(i).setName(scanner.nextLine());
                        break;
                    }
                    case 2: {
                        System.out.println("Giá mới: ");
                        productList.get(i).setPrice(Double.parseDouble(scanner.nextLine()));
                        break;
                    }
                    case 3: {
                        System.out.println("Mô tả mới: ");
                        productList.get(i).setDescribe(scanner.nextLine());
                    }
                }
                System.out.println("Sửa sản phẩm thành công!!!");
                break;
            }
            if (productList.get(i) == null) {
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy sản phẩm tương ứng!!!");
        }
    }

    @Override
    public void deleteById(int idDel) {
        boolean flag = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i) != null && productList.get(i).getId() == idDel) {
                flag = true;
                productList.remove(i);
                break;
            }
            if (productList.get(i) == null) {
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy sản phẩm tương ứng!!!");
        }
    }

    @Override
    public void find() {

    }
}
