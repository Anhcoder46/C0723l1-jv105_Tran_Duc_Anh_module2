import java.util.Scanner;

public class Tong_cac_so_xac_dinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int row = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int col = sc.nextInt();
        double[][] array = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhap gia tri cho phan tu hang " + i + ", cot " + j + ": ");
                array[i][j] = sc.nextDouble();
            }
        }
        System.out.print("Nhap thu tu cua cot de tinh tong: ");
        int colSum = sc.nextInt();
        double columSum = 0;
        for(int i = 0; i < row; i++) {
            columSum += array[i][colSum];
        }
        System.out.println("Tong cua cot " + colSum + " la: " + columSum);
    }
}