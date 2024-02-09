package Array;

public class reverseArray {
    public static void reverse(int marks[]) {
        int start = 0, end = marks.length - 1;
        while (start < end) {
            int temp = marks[end];
            marks[end] = marks[start];
            marks[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 1, 2 ,6,8,3,5,9,};
        reverse(marks);
        for (int i = 0; i < marks.length; i++) {
            System.err.print(marks[i] + " ");
        }
    }

}
