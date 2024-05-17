public class Iteration {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int f = n + fact(n - 1);
        return f;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial By using function: " + fact(n));
        int f = 0;
        for (int i = 1; i <= n; i++) {
            f = f + i;
        }
        System.out.println("Fctorials by using the Iteration: " + f);
    }
}
