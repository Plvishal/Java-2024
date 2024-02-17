package SortingAlgorithm;

public class SelectionSort {
    // Increasing Order
    public static void selectionAccendingOrder(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int minPos = turn;
            for (int j = turn + 1; j < arr.length; j++) { // For unSorted Array
                if (arr[minPos] < arr[j]) {
                    minPos = j;

                }
            }
            // Swapping
            int temp = arr[minPos];
            arr[minPos] = arr[turn];
            arr[turn] = temp;

        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 4, 2, 1 };
        selectionAccendingOrder(arr);
        printArr(arr);

    }
}
