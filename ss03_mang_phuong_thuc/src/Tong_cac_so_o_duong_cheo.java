import java.util.Scanner;

public class Tong_cac_so_o_duong_cheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc ma tran hinh vuong: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("Nhap cac phan tu cua ma tran:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Tong cac duong cheo chinh cua ma tran la: " + sum);
        scanner.close();
    }
}