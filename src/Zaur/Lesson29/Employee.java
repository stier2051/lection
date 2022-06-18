package Zaur.Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    void printEmployee (Employee employee) {
        System.out.println("name: " + employee.name + ", department: " + employee.department + ", salary " + employee.salary);
    }

    void filtraciyaRabotnikov (ArrayList<Employee> employees, Predicate<Employee> employeePredicate) {
        for (Employee e : employees) {
            if (employeePredicate.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        Employee employee1 = new Employee("Alex", "IT", 5000);
        Employee employee2 = new Employee("Peter", "Sale", 3000);
        Employee employee3 = new Employee("AMonika", "HR", 2500);
        Employee employee4 = new Employee("Viktoria", "IT", 5500);
        Employee employee5 = new Employee("Support", "Support", 3300);
        Employee employee6 = new Employee("Rose", "IT", 2000);
        Employee employee7 = new Employee("Lars", "Sale", 3450);
        Employee employee8 = new Employee("Lora", "HR", 2700);
        Employee employee9 = new Employee("IT", "IT", 6500);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        list.add(employee6);
        list.add(employee7);
        list.add(employee8);
        list.add(employee9);

        TestEmployee testEmployee = new TestEmployee();
        testEmployee.filtraciyaRabotnikov(list, employee -> {return employee.department.equals("IT") && employee.salary > 5000;});
        testEmployee.filtraciyaRabotnikov(list, employee -> employee.name.startsWith("A") && employee.salary < 3000);
        testEmployee.filtraciyaRabotnikov(list, (Employee employee) -> employee.name.equals(employee.department));
    }
}
