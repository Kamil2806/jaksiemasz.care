package task1.Component;

import task1.Enum.EnumRole;

public abstract class AbstractEmployee implements Employee {

    private String employeeName;
    private EnumRole employeeRole;

    public AbstractEmployee(String employeeName, EnumRole employeeRole) {
        this.employeeName = employeeName;
        this.employeeRole = employeeRole;
    }

    @Override
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public EnumRole getEmployeeRole() {
        return employeeRole;
    }
}
