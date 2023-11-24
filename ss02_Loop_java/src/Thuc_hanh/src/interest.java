import java.awt.*;
import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien: ");
        money = sc.nextDouble();
        System.out.println("Nhap thang gui: ");
        month = sc.nextInt();
        System.out.println("Nhap lai xuat: ");
        interestRate = sc.nextDouble();
        double calculate = 0;
        for (int i = 0; i < month; i++) {
            calculate += money * (interestRate / 100) / 12 * month;
            System.out.println("Lai xuat cua ban la: " + calculate);
        }
    }
}
