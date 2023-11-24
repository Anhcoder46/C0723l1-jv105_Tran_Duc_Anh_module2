import java.util.Scanner;

public class ReverseArray {
    // Đảo ngược các phần tử trong mảng
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap do dai cua mang ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Do dai cua mang khong vuot qua 20");
            }
        } while (size > 20);

        array = new int[size];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // In mảng ban đầu
        System.out.printf("%-20s%s", "Mang ban dau: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Đảo ngược mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        // In mảng sau khi đảo ngược
        System.out.printf("\n%-20s%s", "Mang sau khi dao nguoc: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
