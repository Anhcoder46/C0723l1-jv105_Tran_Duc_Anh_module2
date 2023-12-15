package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhuongTienController {
    public void displayMenuChuongTrinh() {
        boolean flag = true;
        MENU_CHINH:
        while (flag) {
            System.out.println("Chương trình quản lý phương tiện giao thông");
            System.out.println("Chọn chức năng: ");
            System.out.println("1. Hiển thị chương trình.");
            System.out.println("2. Thêm phương tiện.");
            System.out.println("3. Xóa phương tiện.");
            System.out.println("4. Thoát.");
            System.out.println("Nhập lựa cho của bạn: ");
            int choice = -1;
            try {
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Chọn lại!");
                continue MENU_CHINH;
            }
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị chương trình");
                    boolean vehicle = true;
                    MENU_HIEN_THI_PHUONG_TIEN:
                    while (vehicle) {
                        System.out.println("Hiển thị xe tải: ");
                        System.out.println("Hiển thị xe ô tô: ");
                        System.out.println("Hiển thị xe máy: ");
                        System.out.println("Thoát!");
                        System.out.println("Nhập lựa chọn của bạn: ");
                        int choose = -1;
                        try {
                            Scanner sc = new Scanner(System.in);
                            choose = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Chọn lại!");
                            continue MENU_HIEN_THI_PHUONG_TIEN;
                        }

                        switch (choose) {
                            case 1:
                                System.out.println("Xe tải: ");
                        }
                    }
            }
        }
    }
}
