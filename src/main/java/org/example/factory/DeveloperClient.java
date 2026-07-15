package org.example.factory;

// This client class needs to use the subclasses for some purpose.
// Creating the object of the interface rather than creating the object of the class.
// helps in lose coupling and robust code.
// Even in runtime we get the object we need, from a single class.

// If there are some methods that are not in the first interface, create a new interface and then create a new static function in the class factory.
public class DeveloperClient {
    public static void main(String[] args) throws Exception {
        Employee emp = EmployeeFactory.getEmployee("JavaDev");
        if (emp == null) {
            throw new Exception("No Class found for object");
        }
        System.out.println(emp.getSalary());
        System.out.println("Now if the interface is more broad.");
        ExperienceEmployee emp2 = EmployeeFactory.getExperienceEmployee("SeniorJavaEng");
        System.out.println(emp2.getExperienceYears());
    }
}
