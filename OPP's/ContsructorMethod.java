
public class ContsructorMethod {
    public static void main(String args[]) {
        Student s = new Student();
        // System.out.println(s);
    }
}

class Student {
    String name = "Vishal Pal";
    int age = 98;

    Student() {
        System.out.println("Name : " + this.name + "   Age : " + this.age);

    }
}