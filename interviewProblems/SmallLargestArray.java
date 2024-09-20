import java.util.Arrays;

public class SmallLargestArray {
    public static void main(String args[]) {
        int numbers[] = { 1, 2, 38, 9, 5 };
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("\n Given array is: " + Arrays.toString(numbers));
        System.out.println("Largest number is array: " + largest);
        System.out.println("Smallest number in the array : " + smallest);
    }
}
