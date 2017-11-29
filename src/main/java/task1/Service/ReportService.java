package task1.Service;


import com.google.common.collect.Lists;
import task1.Component.Employee;
import task1.Report;
import task1.Task;

import java.util.List;

public class ReportService {

    public static Report getReport(Employee employee) {

        String report;
        List<String> lists = Lists.newLinkedList();
        for (Task t : employee.getEmployeeTask()) {

            report = "Task: " + t.getTopic() + ", Status" + t.getStatus();
        }

        return;
    }
}
