package com.hp.restful;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {
    private static Employees list = new Employees();

    static {
        list.getEmployeeList().add(new Employee(1, "Don", "Velas", "1337@gmail.com", "CEO"));
        list.getEmployeeList().add(new Employee(2, "Mike", "Wash", "123@gmail.com", "CTO"));
        list.getEmployeeList().add(new Employee(3, "John", "Doe", "456@gmail.com", "CFO"));
        list.getEmployeeList().add(new Employee(4, "Alberto", "Doe", "789@gmail.com", "CSO"));
        list.getEmployeeList().add(new Employee(5, "Cesar", "Doe", "101112@gmail.com", "VP"));

    }

    public Employees getAllEmployees() {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}