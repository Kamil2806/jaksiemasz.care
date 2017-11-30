package task1.Leaf;

import task1.Component.Employee;
import task1.Enum.EnumRole;
import task1.Service.IntroducingService;
import task1.Report;
import task1.Task;


public class Developer implements Employee {

    private final String employeeName;
    private final EnumRole employeeRole;
    private Report report;

    public Developer(String employeeName, EnumRole employeeRole) {
        this.employeeName = employeeName;
        this.employeeRole = employeeRole;
        report = new Report();
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
    public void assign(Task task) { }

    @Override
    public Report reportWork() {
        return report;
    }

    @Override
    public String toString() {
        return IntroducingService.introduceDeveloper(this);
    }
}