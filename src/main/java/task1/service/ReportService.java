package task1.service;

import task1.employees.Employee;
import task1.employees.Report;
import task1.employees.Task;
import task1.employees.TeamManager;

import java.util.List;

public class ReportService {

    public Report getReport(List<Employee> employees, TeamManager teamManager) {
        if (employees.isEmpty() || verifyIfEmployeesHaveNoReports(employees)) {
            return new Report("NO REPORT");
        } else return createReport(teamManager);
    }

    private Report createReport(TeamManager teamManager) {
        String report = "";
        for (Task task: teamManager.getTasks()) {
            report = report +
                    task.getTopic() + ", " +
                    task.getStatus() + ", " +
                    task.getAssignedEmployee() + "\n";
        } return new Report(report);
    }

    private Report getReportsFromEmployees(List<Employee> employees) {
        String report = "";
        for (Employee employee : employees) {
                report = report +
                        employee.reportWork() + ", ";
            } return new Report(report);
    }

    private boolean verifyIfEmployeesHaveNoReports(List<Employee> employees) {
        for (Employee employee : employees) {
            if (employee.reportWork().getDescription() != "NO REPORT")
                return false;
        }
        return true;
    }
}
