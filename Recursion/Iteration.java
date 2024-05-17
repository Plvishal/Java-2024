public class Iteration {

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        while (n >= 1) {
            sum = sum + n;
            n--;
        }
        System.out.println(sum);
    }
}
