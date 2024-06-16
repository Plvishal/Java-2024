import java.util.*;

public class ArraySorted {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurrence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }

        return firstOccurrence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 9, 5, 5 };
        System.out.println(isSorted(arr, 0));
        System.out.println(firstOccurrence(arr, 9, 0));
        System.out.println(lastOccurence(arr, 5, 0));

    }
}
