package Array;

public class binarySearch {
    public static int biSearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) { // RIGHT
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 9, 12, 34, 56, 67, 78 };
        int key = 2;
        int res = biSearch(number, key);
        System.out.println(res);
        if (res == -1) {
            System.err.println("Key is not found in the array list");
        } else {
            System.out.println("Key found at index : " + res);
        }

    }

}
