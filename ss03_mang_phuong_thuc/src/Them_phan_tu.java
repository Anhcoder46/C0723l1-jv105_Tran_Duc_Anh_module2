import java.util.Scanner;

public class Them_phan_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Phan tu muon them: ");
        int l = sc.nextInt();
        System.out.println("Phan tu o vi tri thu may: ");
        int m = sc.nextInt();
        int[] brr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (i < m) {
                brr[i] = arr[i];
            } else {
                brr[i + 1] = arr[i];
            }
        }
        brr[m] = l;

        System.out.println("Mang moi: ");
        for (int i = 0; i <= n; i++) {
            System.out.println(brr[i]);
        }
    }
}