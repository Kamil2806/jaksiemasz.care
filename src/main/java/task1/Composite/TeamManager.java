package task1.Composite;

import com.google.common.collect.Lists;
import task1.Component.AbstractEmployee;
import task1.Component.Employee;
import task1.Component.Manager;
import task1.Enum.EnumDestination;
import task1.Report;
import task1.Service.ReportService;
import task1.Task;

import java.util.List;

public class TeamManager extends AbstractEmployee implements Manager {

    private final List<Employee> employees;
    private Integer width;

    public TeamManager(String employeeName, EnumDestination employeeRole, List<Employee> employees, Integer width) {
        super(employeeName, employeeRole);
        this.width = width;
        this.employees = Lists.newArrayListWithCapacity(width);
    }

    @Override
    public void hire(Employee employee) {
        if(canHire()) {
            employees.add(employee);
        }
    }

    @Override
    public void fire(Employee employee) {
        if(employees.contains(employee)) {
            employees.remove(employee);
        }
    }

    @Override
    public boolean canHire() {
        if(employees.size() >= this.width) {
            return false;
        }
        else return true;
    }

    @Override
    public void assign(Task task) {
        for (Employee employee : employees) {
            if(employee.getEmployeeRole() == task.getDestination()) {
                employee.getEmployeeTask().add(task);
            }
        }
    }

    @Override
    public Report reportWork() {
        return ReportService.getReport();
    }

    @Override
    public List<Task> getEmployeeTask() {
        return null;
    }
}
