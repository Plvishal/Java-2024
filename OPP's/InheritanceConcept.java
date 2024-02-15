
public class InheritanceConcept {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.color = "Blacks";
        d.eat();
        d.legs = 4;
        d.name = "German Shefert";
        System.out.println("Dog Name : " + d.name);
        System.out.println("Color : " + d.color);
        System.out.println("Legs : " + d.legs);
    }

}

// Base Class
// class Animal {
// void eat() {
// System.out.println("Eat");
// }

// void breathe() {
// System.out.println("Breathe");
// }
// }

// class Fish extends Animal {
// // int fins;
// void swim() {
// System.out.println("Swim in water");
// }
// }

class Animal {
    String color;

    void eat() {
        System.out.println("Eat");
    }

    void breathe() {
        System.out.println("Breathe");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dogs extends Mammal {
    String name;
}
