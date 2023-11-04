package science_technologies;

import java.util.*;
import java.util.stream.Collectors;

public class science_technologies_31_10_23 {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "abdul1","programmer",50700L));
        list.add(new Employee(2, "abdul2","teacher",5000L));
        list.add(new Employee(3, "abdul3","programmer",900L));
        list.add(new Employee(4, "abdul4","teacher",50009L));
        list.add(new Employee(5, "abdul5","programmer",5000L));
        list.add(new Employee(6, "abdul6","legal",50L));

        List<Employee> grtThan5000 = list.stream()
                .filter(emp -> emp.getSalary() >5000)
                .collect(Collectors.toList());
        List<String> grtThan5000Names = list.stream()
                .filter(emp -> emp.getSalary() >5000)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(grtThan5000Names);

        String maxSalEmp = list.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .map(Employee::getName).get();

        System.out.println(maxSalEmp);

        Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(collect);
    }

}

class Employee {
    private Integer id;
    private String name;
    private String department;
    private Long salary;

    public Employee(Integer id, String name, String department, Long salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}