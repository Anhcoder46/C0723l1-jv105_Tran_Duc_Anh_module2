import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " phần tử: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("\nMảng ban đầu:");
        for (int i = 0; i <= list.length - 1; i++) {
            System.out.print(list[i] + " , ");
        }
        insertionSort(list);
        System.out.println("\nMảng sai khi sắp xếp: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " , ");
        }
    }

    public static void insertionSort(int[] list) {
        int pos, x;
        int n = list.length;
        for (int i = 1; i < n; i++) {
            // Đoạn list[0] đến list[i-1] đã được sắp xếp
            x = list[i];
            pos = i;
            while (pos > 0 && list[pos - 1] > x) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
        }
    }
}
