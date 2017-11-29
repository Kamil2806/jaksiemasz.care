package task1.Service;

import task1.Component.Employee;

public class IntroducingService {


    public static String introduceDeveloper(Employee employee) {
        return "Name: " + employee.getEmployeeName() +
                ", Role: " + employee.getEmployeeRole() +
                "Report: " + employee.reportWork() +
                "\n";
    }
}
