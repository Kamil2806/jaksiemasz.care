package task1.Component;

import task1.Enum.EnumDestination;

public abstract class AbstractEmployee implements Employee {

    private String employeeName;
    private EnumDestination employeeRole;

    public AbstractEmployee(String employeeName, EnumDestination employeeRole) {
        this.employeeName = employeeName;
        this.employeeRole = employeeRole;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public EnumDestination getEmployeeRole() {
        return employeeRole;
    }
}
