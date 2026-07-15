package org.example.factory;

public class SeniorJavaEng implements ExperienceEmployee {
    @Override
    public int getExperienceYears() {
        return 3;
    }

    @Override
    public int getSalary() {
        return 10000;
    }
}
