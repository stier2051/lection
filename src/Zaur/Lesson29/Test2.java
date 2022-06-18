package Zaur.Lesson29;

import java.util.ArrayList;

public class Test2 {
}

class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo1 {
    void printStudent (Student1 st) {
        System.out.println("name: " + st.name + ", sex: " + st.sex + ", age: " + st.age + ", course: " + st.course + ", avgGrade: " + st.avgGrade);
    }

    void testStudents (ArrayList <Student1> aL, StudentChecks sc) {
        for (Student1 s : aL) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student1> list = new ArrayList<>();
        Student1 st1 = new Student1("Ivan", 'm', 22, 3, 8.3);
        Student1 st2 = new Student1("Nikolay", 'm', 28, 2, 6.4);
        Student1 st3 = new Student1("Elena", 'f', 19, 1, 8.9);
        Student1 st4 = new Student1("Petr", 'm', 35, 4, 7);
        Student1 st5 = new Student1("Marya", 'f', 23, 3, 9.1);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo1 si = new StudentInfo1();

        si.testStudents(list, (Student1 st) -> {return st.avgGrade > 8.5;});
        System.out.println("------------------------");
        si.testStudents(list, (Student1 st) -> {return st.age > 22;});
        System.out.println("------------------------");
        si.testStudents(list, (Student1 st) -> {return st.sex == 'm';});
        System.out.println("------------------------");
    }
}

interface StudentChecks {
    boolean test (Student1 s);
}