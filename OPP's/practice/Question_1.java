class Question_1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Vishal Pal";
        s.marks = 76;
        s.showDetails();
    }
}

// Find out the correct statement to assign name to object
class Student {
    String name;
    int marks;

    void showDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Marks : " + this.marks);
    }
}