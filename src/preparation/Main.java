package preparation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John Doe", 50000, "IT"),
                new Employee(2, "Jane Smith", 60000, "Mech"),
                new Employee(3, "Alice Johnson", 55000, "Salse"),
                new Employee(4, "Bob Brown", 58000, "IT")
        );

        List<Employee> l2 = Arrays.asList(
                new Employee(10, "Abdul Kather1", 2000, "Salse"),
                new Employee(12, "Abdul Kather2", 2003, "Mech"),
                new Employee(1, "John Doe", 50000, "IT"),
                new Employee(2, "Jane Smith", 60000, "Mech"),
                new Employee(3, "Alice Johnson", 55000, "Salse"),
                new Employee(4, "Bob Brown", 58000, "IT")
        );
        List<Employee> sorted = l2.stream()
                .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId))
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);

        Employee max = l2.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .get();

        Map<String, Long> collect = l2.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect);

    }


}

class Employee {
    private int id;
    private String name;
    private int salary;
    private String department;

    public Employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", Department=" + department +
                '}';
    }


}
