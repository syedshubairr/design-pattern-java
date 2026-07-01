package org.example.factory;

// This client class needs to use the subclasses for some purpose.
// Creating the object of the interface rather than creating the object of the class.
// helps in lose coupling and robust code.
// Even in runtime we get the object we need, from a single class.
public class DeveloperClient {
    public static void main(String[] args) throws Exception {
        Employee emp = EmployeeFactory.getEmployee("JavaDev");
        if (emp == null) {
            throw new Exception("No Class found for object");
        }
        System.out.println(emp.getSalary());
    }
}
