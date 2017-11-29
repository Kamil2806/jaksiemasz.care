package task1.Component;

import task1.Enum.EnumDestination;
import task1.Report;
import task1.Task;

import java.util.List;

public interface Employee {

    String getEmployeeName();

    EnumDestination getEmployeeRole();

    void assign(Task task);

    Report reportWork();

    List<Task> getEmployeeTask();
}
