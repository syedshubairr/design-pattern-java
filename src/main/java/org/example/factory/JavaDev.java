package org.example.factory;

// This is out subclass
public class JavaDev implements Employee
{
    @Override
    public int getSalary() {
        System.out.println("Getting JavaDev Salary");
        return 1090;
    }
}
