package task1.Component;

import task1.Enum.EnumRole;
import task1.Enum.EnumSex;
import task1.Enum.EnumStatus;
import task1.Report;
import task1.Task;

public interface Employee {

    String getEmployeeName();

    EnumRole getEmployeeRole();

    String getAcademy();

    EnumSex getSex();

    String getOriginCountry();

    void setEmail(String email);

    String getEmail();

    void assign(Task task);

    void setTaskStatus(EnumStatus enumStatus);

    Report reportWork();
}
