package task1.employees;

import com.google.common.collect.Lists;
import task1.enums.EnumRole;
import task1.enums.EnumStatus;
import task1.service.IntroducingService;

import java.util.List;

public class Task {

    private final String topic;
    private final String description;
    private final EnumRole Destination;
    private EnumStatus status;
    private Developer assignedEmployee;
    private static List<Task> tasks = Lists.newLinkedList();

    public Task(String topic, String description, EnumRole destination) {
        this.topic = topic;
        this.description = description;
        this.status = EnumStatus.WAIT_TO_ASSIGN;
        this.Destination = destination;
        this.tasks.add(this);
    }

    public String getTopic() {
        return topic;
    }

    public static List<Task> getTasks() { return tasks; }

    public String getDescription() {
        return description;
    }

    public EnumRole getDestination() {
        return Destination;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        if(status == EnumStatus.FINISHED) {
            this.assignedEmployee.setIsBusy(false);
        }
        this.status = status;
    }

    @Override
    public String toString() {
        return IntroducingService.introduceTask(this);
    }

    public void setAssignedEmployee(Developer assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
    }

    public Employee getAssignedEmployee() {
        return assignedEmployee;
    }
}
