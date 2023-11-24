import java.util.Scanner;

public class ValueArray {
    public static void main(String[] args) {
        // Tìm giá trị trong mảng
        String[] students = {"DUCANH", "BANTANG", "NYCO"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien:");
        String name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Sinh vien " + name + " o vi tri thu: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Sinh vien " + name + " khong co trong danh sach");
        }
    }
}
