package Example1;

class Human {
    String name = "Human";
}

class Student extends Human {
    String name = "Student";
}

public class Main {
    public static void main(String[] args) {
        Human student = new Student();
        System.out.println(student.name);
    }
}