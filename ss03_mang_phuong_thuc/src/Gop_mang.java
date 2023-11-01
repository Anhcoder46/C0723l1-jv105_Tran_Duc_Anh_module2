import java.util.Scanner;

public class Gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Nhap kich thuoc mang 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Nhap cac phan tu cua mang 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Nhap cac phan tu cua mang 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[size1 + size2];

        int index = 0;
        for (int i = 0; i < size1; i++) {
            array3[index] = array1[i];
            index++;
        }

        for (int i = 0; i < size2; i++) {
            array3[index] = array2[i];
            index++;
        }

        System.out.println("Mang moi:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}