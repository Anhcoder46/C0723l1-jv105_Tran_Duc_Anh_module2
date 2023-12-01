import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + "values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
    public static void insersionSort(int[] list) {
        int pos, x;
        int n = list.length;
        int i;
        for (i = 1; i < n; i++) {
            // Đoạn list[0] đ được sắp xếp
            x = list[i];
            pos = i;
            while (pos > 0 && list[pos - 1] > x) {
                list[pos + 1] = list[pos];
                pos--;
                list[pos + 1] = x;
            }
        }
        System.out.print("List after the  " + i + "' sort: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
        System.out.println();
    }
}