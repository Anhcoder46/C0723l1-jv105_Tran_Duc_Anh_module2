package repository;
import module.Product;
import module.SortingByIDAscending;
import module.SortingByIDDecrease;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Database implements IDatabase {
    private Scanner sc = new Scanner(System.in);
    private static ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product("Áo sơ mi", 01, 250000));
        productArrayList.add(new Product("Áo khoác", 02, 300000));
        productArrayList.add(new Product("Quần tây", 03, 175000));
        productArrayList.add(new Product("Quần thun", 04, 125000));
    }

    @Override
    public void addProduct(Product product) {
        productArrayList.add(product);
    }

    @Override
    public void updateProduct(int idUpdate) {
        for (Product product : productArrayList) {
            if (product.getId() == idUpdate) {
                System.out.println("Nhập tên mới: (old name: " + product.getName() + ")");
                product.setName(sc.nextLine());
                System.out.println("Nhập id mới: (old id: " + product.getId() + ")");
                product.setId(sc.nextInt());
                System.out.println("Nhập giá mới: (old price: " + product.getPrice() + ")");
                product.setPrice(sc.nextInt());
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy Id");
    }

    @Override
    public ArrayList<Product> getProductList() {
        return productArrayList;
    }

    @Override
    public void searchProduct(String string) {
        for (Product product : productArrayList) {
            if (product.getName().toLowerCase().contains(string.toLowerCase())) {
                System.out.println(product.getName());
            }
        }
    }

    @Override
    public void deleteProduct(int idDelete) {
        for (Product product: productArrayList) {
            if (product.getId() == idDelete) {
                productArrayList.remove(product);
                System.out.println("Đã xóa");
                return;
            }
        }
        System.out.println("Không tìm thấy Id!");
    }

    @Override
    public void sortingProduct(int Ichoice) {
        if (Ichoice == 1) {
            Comparator comparator = new SortingByIDAscending();
            Collections.sort(productArrayList, comparator);
        }else {
            Comparator comparator = new SortingByIDDecrease();
            Collections.sort(productArrayList, comparator);
        }
        System.out.println("Sắp xếp!");
    }
}
