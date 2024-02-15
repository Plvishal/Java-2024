
public class InheritanceConcept {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();
        f.swim();

    }

}

// Base Class
class Animal {
    void eat() {
        System.out.println("Eat");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

class Fish extends Animal {
    // int fins;
    void swim() {
        System.out.println("Swim in water");
    }
}
