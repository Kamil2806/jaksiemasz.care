package task1.Service;

import task1.Component.Employee;
import task1.Composite.TeamManager;
import task1.Leaf.Developer;
import task1.Report;
import task1.Task;

public class IntroducingService {


    public static String introduceDeveloper(Developer developer) {
        String busy = "";
        if(developer.isBusy()) busy = "busy";
        else busy = "free";
        return "Name: " + developer.getEmployeeName() +
                ", Role: " + developer.getEmployeeRole() +
                ", Status: " + busy;
    }

    public static String introduceTeamManager(TeamManager teamManager) {
        return "Name: " + teamManager.getEmployeeName() +
                ", Role: " + teamManager.getEmployeeRole() +
                ", Report: " + teamManager.getNumberOfTask() +
                " task in progress" +
                ", Number of employees: " + teamManager.getNumOfEmployees() +
                " (" + getEmployeesNames(teamManager) + "]" +
                "\n";
    }

    public static String introduceReport(Report report) {
        return report.getDescription();
    }

    private static String getEmployeesNames(TeamManager teamManager) {
        String names = "";
        String comma = ", ";
        for (Employee employee : teamManager.getEmployees() ) {
            if(employee.equals(teamManager.getEmployees().
                    get(teamManager.getEmployees().size()-1))) comma = "";
            names = names + employee.getEmployeeName() + comma;
        }
        return names;
    }

    public static String introduceTask(Task task) {
        return "Topic: " + task.getTopic() +
                ", Description: " + task.getDescription() +
                ", Status: " + task.getStatus() +
                getAssignedEmployeeName(task) +
                "\n";
    }

    private static String getAssignedEmployeeName(Task task) {
        if(task.getAssignedEmployee() == null) return "";
        else return ", Assigned employee: " + task.getAssignedEmployee().getEmployeeName();
    }
}
