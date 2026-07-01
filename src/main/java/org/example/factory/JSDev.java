package org.example.factory;

public class JSDev implements Employee {
    @Override
    public int getSalary() {
        System.out.println("Getting JS Dev Salary");
        return 1110;
    }
}
