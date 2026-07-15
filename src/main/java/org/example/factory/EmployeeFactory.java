package org.example.factory;

// This class will be used to create and return the employees class as per needs of the client class(DeveloperClient)
public class EmployeeFactory {
    public static Employee getEmployee(String employeeType) {
        if (employeeType.trim().equalsIgnoreCase("JavaDev")) {
            return new JavaDev();
        } else if (employeeType.trim().equalsIgnoreCase("JSDev")) {
            return new JSDev();
        } else {
            return null;
        }
    }

    public static ExperienceEmployee getExperienceEmployee(String employeeType) {
        if (employeeType.trim().equalsIgnoreCase("SeniorJavaEng")) {
            return new SeniorJavaEng();
        } else {
            return null;
        }
    }
}
