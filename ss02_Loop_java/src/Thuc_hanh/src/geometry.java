import java.util.Scanner;

public class geometry {
    public static void main(String[] args) {
        //Thiết kế menu cho ứng dụng
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Ve hinh tam giac");
        System.out.println("2. Ve hinh vuong");
        System.out.println("3. Ve hinh chu nhat");
        System.out.println("4. Thoat");
        System.out.println("Nhap su lua chon cua ban: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Ve hinh tam giac: ");
                System.out.println("*");
                System.out.println("* *");
                System.out.println("* * *");
                System.out.println("* * * *");
                System.out.println("* * * * *");
                break;
            case 2:
                System.out.println("Ve hinh vuong: ");
                System.out.println("* * * * * ");
                System.out.println("* * * * * ");
                System.out.println("* * * * * ");
                System.out.println("* * * * * ");
                System.out.println("* * * * * ");
                break;
            case 3:
                System.out.println("Ve hinh chu nhat: ");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                System.out.println("* * * * * * * *");
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("Khong the ve");
        }
    }
}
