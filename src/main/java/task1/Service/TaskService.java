package task1.Service;

import task1.Component.Employee;

import java.util.List;

public class TaskService {

    public Integer getNumberOfTask(List<Employee> employees) {
        int i = 0;
        for (Employee employee : employees) {
            if(employee.reportWork().getDescription() != "NO REPORT") {
                i++;
            }
        }
        return i;
    }
}
