package task4;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String department;
    private double salary;

    public Employee(String firstName, String lastName, String department, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                department.equals(employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, department, salary);
    }
}
