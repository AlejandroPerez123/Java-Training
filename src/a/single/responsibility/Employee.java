package a.single.responsibility;

import java.util.Date;

public class Employee {
    private String name;
    private String id;
    private double salary;
    private Date startDate;
    private String position;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}
