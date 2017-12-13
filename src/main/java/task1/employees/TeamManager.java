package task1.employees;

import com.google.common.collect.Lists;
import task1.employees.ceo.CanHire;
import task1.employees.ceo.CeoPredicates;
import task1.enums.EnumRole;
import task1.enums.EnumStatus;
import task1.service.IntroducingService;
import task1.service.ReportService;
import task1.service.TaskService;

import java.util.List;

public class TeamManager extends AbstractEmployee implements Manager {

    public CanHire canHireType;
    private List<Employee> employees;
    private List<Task> tasks;
    private Integer maxNumOfEmployees;
    private Integer numOfEmployees = 0;
    private ReportService reportService = new ReportService();
    private Report report;
    private TaskService taskService = new TaskService();

    private TeamManager() {
    }

    public TeamManager(Builder teamManagerBuilder) {
        super(teamManagerBuilder);
        this.maxNumOfEmployees = teamManagerBuilder.maxNumOfEmployees;
        this.tasks = teamManagerBuilder.tasks;
        this.employees = teamManagerBuilder.employees;
        this.report = teamManagerBuilder.report;
        this.canHireType = teamManagerBuilder.canHireType;
    }

    @Override
    public void hire(Employee employee) {
        if (canHire(employee)) {
            employees.add(employee);
            this.numOfEmployees++;
        } else System.out.println("Can't do this");
    }

    @Override
    public void fire(Employee employee) {
        if (employees.contains(employee)) {
            employees.remove(employee);
            this.numOfEmployees--;
        }
    }

    public boolean canHire(Employee employee) {
        return canHireType.canHire(employee, this);
    }

    public void setCanHireType(CanHire canHireType) {
        this.canHireType = canHireType;
    }

    @Override
    public void assign(Task task) {
        for (Employee employee : employees) {
            if (employee instanceof Developer) {
                if (employee.getEmployeeRole() == task.getDestination() && !((Developer) employee).getIsBusy()
                        && task.getStatus() != EnumStatus.ASSIGNED) {
                    task.setStatus(EnumStatus.ASSIGNED);
                    task.setAssignedEmployee((Developer) employee);
                    employee.assign(task);
                    this.getTasks().add(task);
                }
            } else employee.assign(task);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public void setTaskStatus(EnumStatus enumStatus) {
        System.out.println("You have no power here for this moment!");
    }

    @Override
    public Report reportWork() {

        return reportService.getReport(employees, this);
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

    public static class Builder extends AbstractEmployeeBuilder<Builder> {

        public CanHire canHireType;
        private List<Employee> employees;
        private List<Task> tasks;
        private Integer maxNumOfEmployees;
        private Report report;

        public Builder(int maxNumOfEmployees, String name, EnumRole role) {
            super(name, role);
            this.maxNumOfEmployees = maxNumOfEmployees;
            this.employees = Lists.newArrayListWithCapacity(maxNumOfEmployees);
            this.report = new Report("NO REPORT");
            this.tasks = Lists.newLinkedList();
            if (role == EnumRole.CEOAGH) this.canHireType = CeoPredicates.canHireAGH;
            else if (role == EnumRole.CEOMALE) this.canHireType = CeoPredicates.canHireMale;
            else if (role == EnumRole.CEOFAMALE) this.canHireType = CeoPredicates.canHireFamale;
            else if (role == EnumRole.CEOGMAIL) this.canHireType = CeoPredicates.canHireGmail;
            else if (role == EnumRole.CEOPOLAND) this.canHireType = CeoPredicates.canHirePoland;
            else this.canHireType = CeoPredicates.canHIreAnyone;
        }

        @Override
        public TeamManager build() {
            return new TeamManager(this);
        }
    }
}