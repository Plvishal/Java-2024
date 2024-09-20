public class MissingNunArray {
    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 5, 6, 7 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        int sum1 = 0;
        for (int j = 1; j <= a.length + 1; j++) {
            sum1 = sum1 + j;
        }

        System.out.println(sum1 - sum);
    }
}
