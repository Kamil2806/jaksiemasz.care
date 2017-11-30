package task1.Composite;

import com.google.common.collect.Lists;
import task1.Component.AbstractEmployee;
import task1.Component.Employee;
import task1.Component.Manager;
import task1.Enum.EnumRole;
import task1.Report;
import task1.Service.IntroducingService;
import task1.Service.ReportService;
import task1.Task;

import java.util.List;

public class TeamManager extends AbstractEmployee implements Manager {

    private final List<Employee> employees;
    private Integer maxNumOfEmployees;
    private ReportService reportService = new ReportService();
    private Report report;

    public TeamManager(String employeeName, EnumRole employeeRole,
                       Integer maxNumOfEmployees) {
        super(employeeName, employeeRole);
        this.maxNumOfEmployees = maxNumOfEmployees;
        this.employees = Lists.newArrayListWithCapacity(maxNumOfEmployees);
        this.report = new Report();
    }

    @Override
    public void hire(Employee employee) {
        if(canHire()) { employees.add(employee); }
    }

    @Override
    public void fire(Employee employee) {
        if(employees.contains(employee)) {
            employees.remove(employee);
        }
    }

    @Override
    public boolean canHire() {
        if(employees.size() >= this.maxNumOfEmployees) {
            return false;
        }
        else return true;
    }

    @Override
    public void assign(Task task) {
        for (Employee employee : employees) {
            if(employee.getEmployeeRole() == task.getDestination()) {
                employee.assign(task);
            }
        }
    }

    @Override
    public Report reportWork() {
        return reportService.getReport(employees);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return IntroducingService.introduceTeamManager(this);
    }
}
