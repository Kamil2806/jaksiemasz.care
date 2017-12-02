package task1.Leaf;

import task1.Component.Employee;
import task1.Enum.EnumRole;
import task1.Enum.EnumStatus;
import task1.Service.IntroducingService;
import task1.Report;
import task1.Task;


public class Developer implements Employee {

    private final String employeeName;
    private final EnumRole employeeRole;
    private Report report;
    private boolean isBusy = false;
    private Task task;

    public Developer(String employeeName, EnumRole employeeRole) {
        this.employeeName = employeeName;
        this.employeeRole = employeeRole;
        report = new Report("NO REPORT");
    }

    @Override
    public String getEmployeeName() {
        return this.employeeName;
    }

    @Override
    public EnumRole getEmployeeRole() {
        return this.employeeRole;
    }

    @Override
    public void assign(Task task) {
        this.task = task;
        this.report.setDescription("Task: " + task.getTopic() + ", Status: " + task.getStatus());
        isBusy = true;
    }

    public void setTaskStatus(Task task, EnumStatus enumStatus) {
        this.task.setStatus(enumStatus);
    }

    @Override
    public Report reportWork() { return report;}

    @Override
    public String toString() {
        return IntroducingService.introduceDeveloper(this);
    }

    public boolean isBusy() {
        return isBusy;
    }
}