package chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
        String variableResult = String.valueOf(input.charAt(0));
        String maxResult = variableResult;

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char prevChar = input.charAt(i - 1);
            if (currentChar > prevChar) {
                variableResult += currentChar;
            } else {
                if (variableResult.length() > maxResult.length()) {
                    maxResult = variableResult;
                }
                variableResult = String.valueOf(currentChar);
            }
        }
        if (variableResult.length() > maxResult.length()) {
            maxResult = variableResult;
        }
        System.out.println("Chuỗi tăng dần có độ dài lớn nhất là: " + maxResult);
    }
}
