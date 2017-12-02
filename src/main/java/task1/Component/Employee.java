package task1.Component;

import task1.Enum.EnumRole;
import task1.Enum.EnumStatus;
import task1.Report;
import task1.Task;

public interface Employee {

    String getEmployeeName();

    EnumRole getEmployeeRole();

    void assign(Task task);

    void setTaskStatus(Task task, EnumStatus enumStatus);

    Report reportWork();
}
