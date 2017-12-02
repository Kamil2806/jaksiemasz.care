package task1.Service;

import task1.Component.Employee;
import task1.Report;

import java.util.List;

public class ReportService {

    public Report getReport(List<Employee> employees) {
        if (employees.isEmpty() || verifyIfEmployeesHaveNoReports(employees)) {
            return new Report("NO REPORT");
        } else return getReportsFromEmployees(employees);
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
