package task1.Leaf;

import task1.Component.Employee;
import task1.Enum.EnumDestination;
import task1.Service.IntroducingService;
import task1.Report;
import task1.Service.ReportService;
import task1.Task;

import java.util.List;

public class Developer implements Employee {

    @Override
    public String getEmployeeName() {
        return null;
    }

    @Override
    public EnumDestination getEmployeeRole() {
        return null;
    }

    @Override
    public void assign(Task task) {

    }

    @Override
    public Report reportWork() {
        return ReportService.getReport(this);
    }

    @Override
    public List<Task> getEmployeeTask() {
        return null;
    }

    @Override
    public String toString() {
        return IntroducingService.introduceDeveloper(this);
    }
}