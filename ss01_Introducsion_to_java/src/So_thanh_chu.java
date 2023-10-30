import java.util.Scanner;
public class So_thanh_chu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number >= 0 && number < 10) {
            System.out.println(convertDigitToWord(number));
        } else if (number >= 10 && number < 20) {
            System.out.println(convertTenToWord(number));
        } else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String tensWord = convertTensToWord(tens);
            String onesWord = convertDigitToWord(ones);
            System.out.println(tensWord + " " + onesWord);
        } else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int remaining = number % 100;
            String hundredsWord = convertDigitToWord(hundreds);
            String remainingWord = convertNumberToWord(remaining);
            System.out.println(hundredsWord + " hundred " + remainingWord);
        } else {
            System.out.println("Không thể đổi");
        }
    }

    public static String convertDigitToWord(int digit) {
        switch (digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String convertTenToWord(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String convertTensToWord(int tens) {
        switch (tens) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }

    public static String convertNumberToWord(int number) {
        if (number >= 0 && number < 10) {
            return convertDigitToWord(number);
        } else if (number >= 10 && number < 20) {
            return convertTenToWord(number);
        } else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String tensWord = convertTensToWord(tens);
            String onesWord = convertDigitToWord(ones);
            return tensWord + " " + onesWord;
        } else {
            return "";
        }
    }
}