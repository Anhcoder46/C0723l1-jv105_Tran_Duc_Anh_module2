package Xay_dung_lop_QuadraticEquation;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap so b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap so c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();

        if (delta > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Phuong trinh co 2 nghiem rieng biet:");
            System.out.println("Nghiem 1: " + root1);
            System.out.println("Nghiem 2: " + root2);
        } else if (delta == 0) {
            double root = equation.getRoot1();
            System.out.println("Phuong trinh co 1 nghiem");
            System.out.println("Nghiem: " + root);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
