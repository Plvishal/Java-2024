
public class MethodOverloading {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        System.out.println(c.sum(1, 3));
        System.out.println(c.sum((float) 1.5, (float) 3.7));
        System.out.println(c.sum(11, 4, 9));

    }
}

class Calculate {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
