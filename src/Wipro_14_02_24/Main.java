package Wipro_14_02_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 1, 3, 4, 5};
        Arrays.stream(arr).distinct().forEach(System.out::print);

        List<Integer> collect = Arrays.stream(arr).boxed()
                .filter(x -> x > 2)
                .collect(Collectors.toList());

        List<Integer> collect1 = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        List<Employee> empList = new ArrayList<>();

        Employee employee = empList.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                .skip(1)
                .findFirst().get();

        Employee employee2 = empList.stream()
                .skip(1)
                .max(Comparator.comparingInt(Employee::getSalary))
                .get();

        Employee employee1 = empList.stream()
                .skip(1)
                .min(Comparator.comparingInt(Employee::getSalary))
                .get();
    }
}

class Employee {
    Integer id;
    Integer salary;
    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
