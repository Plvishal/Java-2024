
public class OddEven {
    public static void oddEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args) {
        oddEven(3);
        oddEven(4);

    }
}
