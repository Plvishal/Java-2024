
public class ContsructorMethod {
    public static void main(String args[]) {
        Student s = new Student("Vishal", 23);
        System.out.println("Name : " + s.name);
        System.out.println("Age : " + s.age);
    }
}

class Student {
    String name;
    int age;

    /*
     * Student() {
     * System.out.println("Name : " + this.name + "   Age : " + this.age);
     * 
     * }
     */
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}