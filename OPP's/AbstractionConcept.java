
public class AbstractionConcept {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.err.println("Walk on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walk on 2 legs");
    }
}