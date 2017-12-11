package task1.employees;

import task1.enums.EnumRole;
import task1.enums.EnumSex;
import task1.enums.EnumStatus;

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
