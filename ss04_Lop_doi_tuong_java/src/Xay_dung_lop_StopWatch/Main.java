package Xay_dung_lop_StopWatch;

import java.util.Random;

public class Main {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        selectionSort(arr);
        stopwatch.stop();
        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Thoi gian troi qua: " + elapsedTime + " milli giay");
    }
}
