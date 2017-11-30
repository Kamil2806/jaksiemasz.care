package task1.Service;

import task1.Component.Employee;
import task1.Component.Manager;
import task1.Composite.TeamManager;
import task1.Report;

public class IntroducingService {


    public static String introduceDeveloper(Employee employee) {
        return "Name: " + employee.getEmployeeName() +
                ", Role: " + employee.getEmployeeRole() +
                ", Report: " + employee.reportWork();
    }

    public static String introduceTeamManager(TeamManager teamManager) {
        return "Name: " + teamManager.getEmployeeName() +
                ", Role: " + teamManager.getEmployeeRole() +
                ", Report: " + teamManager.reportWork() +
                ", \nEmployees: " + teamManager.getEmployees() +
                "\n";
    }

    public static String introduceReport(Report report) {
        if (report == null) return  new Report("It's nothing here");
        else return report.getDescription();
    }
}
