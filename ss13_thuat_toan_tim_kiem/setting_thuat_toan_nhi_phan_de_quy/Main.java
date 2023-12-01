import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Nhập phần tử:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập phần tử cần tìm: ");
        int value = scanner.nextInt();
        Arrays.sort(array); // sắp xếp mảng

        int index = binarySearch(array, 0, array.length - 1, value);

        if (index != -1) {
            System.out.println("Phẩn tử cần tìm ở vị trí: " + index);
        } else {
            System.out.println("Không tìm thấy phần tử.");
        }
    }

    // hàm tìm kiếm nhị phân đệ quy
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle;
            } else if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            } else {
                return binarySearch(array, middle + 1, right, value);
            }
        }
        return -1;
    }
}