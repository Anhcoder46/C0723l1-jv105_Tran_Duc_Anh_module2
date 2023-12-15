import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ProductManagement {
    private static final String FILE_NAME = "D:\\C0723l1-jv105_Tran_Duc_Anh_module2\\ss17_io_binary_serialization\\quan_ly_san_pham\\src\\Product.txt";

    public static void main(String[] args) {
        ArrayList<Product> products = loadProduct();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("---Quản lý sản phẩm---");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");
            System.out.println("Enter number: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Product product = addProduct();
                    products.add(product);
                    saveProduct(products);
                case 2:
                    displayProduct(products);
                    break;
                case 3:
                    System.out.println("Nhập sản phẩm cần tìm kiếm");
                    String searchCode = sc.nextLine();

                    findProduct(products, searchCode);
                    break;
                case 4:
                    System.out.println("Thoát!");
                    System.exit(0);
                default:
                    System.out.println("Nhập lại!");
            }
        } while (choice != 4);
    }

    private static void findProduct(ArrayList<Product> productManagements, String code) {
        for (Product p : productManagements) {
            if (p.getProductCode().equalsIgnoreCase(code)) {
                System.out.println("Sản phẩm bạn đang tìm kiếm là: ");
                System.out.println(p);
            }
        }
    }

    private static void displayProduct(ArrayList<Product> productManagements) {
        System.out.println("Hiển thị sản phẩm");
        for (Product p : productManagements) {
            System.out.println(p);
            System.out.println();
        }
    }

    private static void saveProduct(ArrayList<Product> products) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\C0723l1-jv105_Tran_Duc_Anh_module2\\ss17_io_binary_serialization\\quan_ly_san_pham\\src\\Product.txt"));
            outputStream.writeObject(products);
            System.out.println("Save to " + "D:\\C0723l1-jv105_Tran_Duc_Anh_module2\\ss17_io_binary_serialization\\quan_ly_san_pham\\src\\Product.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Product addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        String code = sc.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá: ");
        double prices = Double.parseDouble(sc.nextLine());
        System.out.println("Nhâp hãng sản xuất: ");
        String manufacture = sc.nextLine();
        System.out.println("Nhập mô tả: ");
        String descriptions = sc.nextLine();
        return new Product(code, name, prices, manufacture, descriptions);
    }

    private static ArrayList<Product> loadProduct() {
        ArrayList<Product> products = new ArrayList<>();
        File file = new File("D:\\C0723l1-jv105_Tran_Duc_Anh_module2\\ss17_io_binary_serialization\\quan_ly_san_pham\\src\\Product.txt");
        if (file.exists()) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\C0723l1-jv105_Tran_Duc_Anh_module2\\ss17_io_binary_serialization\\quan_ly_san_pham\\src\\Product.txt"));
                products = (ArrayList<Product>) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return products;
    }
}
