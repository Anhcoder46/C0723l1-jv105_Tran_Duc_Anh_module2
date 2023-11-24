import java.util.Scanner;

public class greates {

    // Tìm ước số chung lớn nhất
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0) {
            System.out.println("Khong co uoc chung");
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        }
        System.out.println("Uoc so chung cua la: " + a);
    }
}
