import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử?: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            array.add(scanner.nextInt());
        }
        System.out.println("Kích thước của mảng: " + array.size());
        System.out.println(array);
        Stack<Integer> stack = new Stack<>();
        while (!array.isEmpty()) {
            stack.push(array.remove(0));
        }
        System.out.println("Mảng trước khi đảo ngược: ");
        System.out.println(stack);
        System.out.println(array);
        while (!stack.isEmpty()) {
            array.add(stack.pop());
        }
        System.out.println("Mảng sau khi đảo ngược: ");
        System.out.println(stack);
        System.out.println(array);
    }
}
