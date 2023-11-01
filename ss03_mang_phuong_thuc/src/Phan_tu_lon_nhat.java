import java.util.Scanner;

public class Phan_tu_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int rows = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran: ");
        int columns = scanner.nextInt();

        double[][] matrix = new double[rows][columns];

        System.out.println("Nhap cac phan tu cua ma tran:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Phan tu tai hang " + (i + 1) + ", cot " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double maxElement = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        System.out.println("Phan tu lon nhat trong ma tran:");
        System.out.println("Gia tri: " + maxElement);
        System.out.println("Toa do: Hang " + (maxRow + 1) + ", Cot " + (maxColumn + 1));
    }
}
