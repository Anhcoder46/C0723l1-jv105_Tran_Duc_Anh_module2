import java.util.Scanner;

public class Cac_loai_hinh {

    public static void main(String[] args) {
        // In menu
        System.out.println("Menu:");
        System.out.println("1. In hinh chu nhat");
        System.out.println("2. In hinh tam giac vuong");
        System.out.println("3. In hinh tam giac can");
        System.out.println("4. Exit");

        // Nhập lựa chọn của bạn
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        // In hình theo lựa chọn của bạn
        switch (choice) {
            case 1:
                // In hình chữ nhật
                int width = in.nextInt();
                int height = in.nextInt();
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= width; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                // In hình tam giác vuông
                int corner = in.nextInt();
                int length = in.nextInt();
                for (int i = 1; i <= length; i++) {
                    for (int j = 1; j <= i; j++) {
                        // góc trái dưới
                        if (corner == 1) {
                            System.out.print("*");
                        }
                        // góc trái trên
                        else if (corner == 2) {
                            System.out.print("*");
                        }
                        // góc phải dưới
                        else if (corner == 3) {
                            System.out.print("*");
                        }
                        // góc phải trên
                        else if (corner == 4) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                // In hình tam giác cân
                int h = in.nextInt();
                for (int i = 1; i <= h; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    for (int j = h - i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                // Thoát
                System.exit(0);
                break;
            default:
                System.out.println("Lua chon khong hop le. Vui long nhap lai.");
                break;
        }
    }
}