package task1.Composite;

import com.google.common.collect.Lists;
import task1.Component.AbstractEmployee;
import task1.Component.Employee;
import task1.Component.Manager;
import task1.Enum.EnumRole;
import task1.Enum.EnumStatus;
import task1.Leaf.Developer;
import task1.Report;
import task1.Service.IntroducingService;
import task1.Service.ReportService;
import task1.Service.TaskService;
import task1.Task;

import java.util.List;

public class TeamManager extends AbstractEmployee implements Manager {

    private final List<Employee> employees;
    private List<Task> tasks;
    private Integer maxNumOfEmployees;
    private Integer numOfEmployees = 0;
    private ReportService reportService = new ReportService();
    private Report report;
    private TaskService taskService = new TaskService();

    public TeamManager(String employeeName, EnumRole employeeRole,
                       Integer maxNumOfEmployees) {
        super(employeeName, employeeRole);
        this.maxNumOfEmployees = maxNumOfEmployees;
        this.employees = Lists.newArrayListWithCapacity(maxNumOfEmployees);
        this.report = new Report("NO REPORT");
        this.tasks = Lists.newLinkedList();
    }

    @Override
    public void hire(Employee employee) {
        if (canHire()) {
            employees.add(employee);
            this.numOfEmployees++;
        }
    }

    @Override
    public void fire(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
            this.numOfEmployees--;
        }
    }

    @Override
    public boolean canHire() {
        if (employees.size() >= this.maxNumOfEmployees) {
            return false;
        } else return true;
    }

    @Override
    public void assign(Task task) {
        for (Employee employee : employees) {
            if (employee instanceof Developer) {
                if (employee.getEmployeeRole() == task.getDestination() && !((Developer) employee).isBusy()) {
                    task.setStatus(EnumStatus.ASSIGNED);
                    task.setAssignedEmployee(employee);
                }
            } else employee.assign(task);
        }
    }

    @Override
    public void setTaskStatus(Task task, EnumStatus enumStatus) {
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

    public Integer getNumberOfTask() {
        return taskService.getNumberOfTask(employees);
    }

    public Integer getNumOfEmployees() {
        return numOfEmployees;
    }
}
