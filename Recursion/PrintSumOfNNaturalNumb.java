public class PrintSumOfNNaturalNumb {
    public static int sumNum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sumNum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNum(5));
    }
}
