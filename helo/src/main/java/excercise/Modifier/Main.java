package excercise.Modifier;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(123, "Hoang");
        Student s3 = new Student(135, "Hoang");
        s1.display();
        s2.display();
        s3.display();
    }
}
