import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        double vnd = 23506;
        double usd;
        Scanner s = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = s.nextDouble();
        double quydoi = usd * 23506;
        System.out.println("Giá trị VNĐ: " + quydoi);
    }
}