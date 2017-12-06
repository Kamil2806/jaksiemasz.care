package task1.Leaf;

import task1.Component.AbstractEmployee;
import task1.Component.Employee;
import task1.Enum.EnumRole;
import task1.Enum.EnumSex;
import task1.Enum.EnumStatus;
import task1.Service.IntroducingService;
import task1.Report;
import task1.Task;


public class Developer extends AbstractEmployee implements Employee {

    private Report report;
    private boolean isBusy = false;
    private Task task;

    public Developer(String employeeName, EnumRole employeeRole, Report report, boolean isBusy, Task task,
                     String academy, EnumSex sex, String originCountry, String email) {
        super(employeeName, employeeRole, academy, sex, originCountry, email);
        this.report = report;
        this.isBusy = isBusy;
        this.task = task;
    }

    @Override
    public void assign(Task task) {
        this.task = task;
        this.report.setDescription("Task: " + task.getTopic());
        this.report.setTask(task);
        this.isBusy = true;
    }

    public void setTaskStatus(EnumStatus enumStatus) {
        this.task.setStatus(enumStatus);
    }

    @Override
    public Report reportWork() { return report;}

    @Override
    public String toString() {
        return IntroducingService.introduceDeveloper(this);
    }

    public boolean getIsBusy() {
        return isBusy;
    }

    public void setIsBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }
}