import java.util.Scanner;

public class Gia_tri_nho_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int minValue = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println("Gia tri nho nhat tròng mang: " + minValue);
    }
}