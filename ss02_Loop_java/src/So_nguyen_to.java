import java.util.Scanner;

public class So_nguyen_to {
    public static void main(String[] args) {
        int n;
        int dem = 0;

        Scanner nt = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = nt.nextInt();

        if (n < 2) {
            System.out.print("Số " + n + " không phải là số nguyên tố");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    dem += 1;
                    break;
                }
            }
            if (dem == 0) {
                System.out.print("Số " + n + " là số nguyên tố.");
            } else {
                System.out.print("Số " + n + " không phải là số nguyên tố.");
            }
        }
    }
}