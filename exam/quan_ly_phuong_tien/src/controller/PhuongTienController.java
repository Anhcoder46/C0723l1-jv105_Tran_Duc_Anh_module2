package controller;

import com.sun.source.tree.WhileLoopTree;
import service.impl.OtoService;
import service.impl.XeMayService;
import service.impl.XeTaiService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhuongTienController {

    public void displayMenuChuongTrinh() {
        boolean flagMenu = true;
        MENU_CHINH:
        while (flagMenu) {
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
                                XeTaiService xeTaiService = new XeTaiService();
                                XeTaiService.display();
                                break;
                            case 2:
                                System.out.println("Xe máy: ");
                                XeMayService xeMayService = new XeMayService();
                                XeMayService.display();
                                break;
                            case 3:
                                System.out.println("Xe Oto: ");
                                OtoService otoService = new OtoService();
                                OtoService.display();
                                break;
                            case 4:
                                System.out.println("Trở lại!");
                                flagMenu = false;
                                break;
                            default:
                                System.out.println("Chọn lại: ");
                                break;
                        }
                    }
                case 2:
                    System.out.println("Chức năng thêm phương tiện: ");
                    boolean flagThem = true;
                    MENU_THEM_PHUONG_TIEN:
                    while (flagThem) {
                        System.out.println("1. Thêm xe tải");
                        System.out.println("2. Thêm xe xe máy");
                        System.out.println("3. Thêm oto");
                        System.out.println("4. Trở lại");
                        System.out.println("Nhập lựa chọn của bạn: ");
                        int chooseThem = -1;
                        try {
                            Scanner sc = new Scanner(System.in);
                            chooseThem = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Chọn lại: ");
                            continue MENU_THEM_PHUONG_TIEN;
                        }
                        switch (chooseThem) {
                            case 1:
                                System.out.println("Them xe tai");
                                XeTaiService xeTaiService = new XeTaiService();
                                xeTaiService.add();
                                break ;
                            case 2:
                                System.out.println("Them xe máy");
                                OtoService otoService = new OtoService();
                                otoService.add();
                                break ;
                            case 3:
                                System.out.println("Them oto");
                                XeMayService xeMayService = new XeMayService();
                                xeMayService.add();
                                break ;
                            case 4:
                                System.out.println("Tro ve xe tai");
                                flagThem = false;
                                break ;
                            default:
                                System.out.println("Chọn lai: ");
                                break ;
                        }
                    }
                    System.out.println("-----------------");
                    break;
                case 3:
                    System.out.println("Chức năng xóa phương tiện: ");
                    boolean flagXoa = true;
                    MENU_XOA_PHUONG_TIEN:
                    while (flagXoa) {
                        System.out.println("1. Xóa xe tải");
                        System.out.println("2. Xóa xe máy");
                        System.out.println("3. Xóa oto");
                        System.out.println("4. Trở lại!");
                        System.out.println("Nhập lựa chọn của bạn: ");
                        int chooseXoa = -1;
                        try {
                            Scanner sc = new Scanner(System.in);
                            chooseXoa = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Chọn lại: ");
                            continue MENU_XOA_PHUONG_TIEN;
                        }
                        switch (chooseXoa) {
                            case 1:
                                System.out.println("Xe tai");
                                XeTaiService xeTaiService = new XeTaiService();
                                xeTaiService.delete();
                                break ;
                            case 2:
                                System.out.println("Oto");
                                OtoService otoService = new OtoService();
                                otoService.delete();
                                break ;
                            case 3:
                                System.out.println("Xe may");
                                XeMayService xeMayService = new XeMayService();
                                xeMayService.delete();
                                break ;
                            case 4:
                                System.out.println("Tro ve");
                                flagXoa = false;
                                break ;
                            default:
                                System.out.println("Moi chon lai");
                                break ;
                        }
                    }
                    System.out.println("---------------");
                    break ;
                case 4:
                    System.out.println("Thoát.");
                    System.out.println("-------------------");
                    flagMenu = false;
                    break ;
                default:
                    System.out.println("Chọn lại: ");
                    break ;
            }
        }
    }
}
