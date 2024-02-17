package SortingAlgorithm;

import java.util.Arrays;

public class JavaInbuildSort {
    public static void pirntArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 2, 1 };
        Arrays.sort(arr);
        pirntArr(arr);
    }
}
