import java.util.Scanner;

public class Xoa_phan_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = array.length;
        System.out.print("Nhap phan tu can xoa: ");
        int x = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            n--; // Giảm số lượng phần tử sau khi xoá
            System.out.println("Phan tu " + x + " da duoc xoa khoi mang.");
        } else {
            System.out.println("Phan tu " + x + " khong xuat hien trong mang.");
        }
        // In ra mảng sau khi xoá
        System.out.print("Mang moi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}