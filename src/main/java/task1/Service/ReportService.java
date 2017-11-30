package task1.Service;

import task1.Component.Employee;
import task1.Report;

import java.util.List;

public class ReportService {

    public Report getReport(List<Employee> employees) {

        String report = "";

        if (employees.isEmpty()) return new Report("NO WORKERS");
        else {
            for (Employee employee : employees) {
                report = report + employee.reportWork().getDescription() + "\n";
            }
            return new Report(report);
        }
    }
}
