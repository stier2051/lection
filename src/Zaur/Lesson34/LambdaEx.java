package Zaur.Lesson34;

import java.util.List;
import java.util.function.Predicate;

public class LambdaEx {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alex", "IT", 5000),
                new Employee("John", "Sales", 2000),
                new Employee("Sarah", "HR", 3000));

        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.sortEmployees(employees, (Employee emp) -> emp.department.equals("Sales"));
        employeeInfo.sortEmployees(employees, (Employee emp) -> emp.salary > 2000);
    }
}

class Employee {
    String name;
    String department;
    int salary;

    public Employee() {}

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeInfo {
    void printEmployee(Employee employee) {
        System.out.println(employee.toString());
    }

    void sortEmployees(List<Employee> employeeList, Predicate<Employee>t) {
        for (Employee employee: employeeList) {
            if (t.test(employee)) {
                printEmployee(employee);
            }
        }
    }
}
