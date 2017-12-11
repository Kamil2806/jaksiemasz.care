package task1.service;

import task1.employees.Employee;

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
