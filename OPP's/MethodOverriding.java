
public class MethodOverriding {
    public static void main(String[] args) {
        Dear d = new Dear();
        d.eat();

    }

}

class Animal {
    void eat() {
        System.out.println("Eat everything");
    }
}

class Dear extends Animal {
    void eat() {
        System.out.println("Eat grass only");
    }
}
