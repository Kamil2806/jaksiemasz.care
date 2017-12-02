package task1;

import com.google.common.collect.Lists;
import task1.Component.Employee;
import task1.Enum.EnumRole;
import task1.Enum.EnumStatus;
import task1.Service.IntroducingService;

import java.util.List;

public class Task {

    private final String topic;
    private final String description;
    private final EnumRole Destination;
    private EnumStatus status;
    private Employee assignedEmployee;
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
        this.status = status;
    }

    @Override
    public String toString() {
        return IntroducingService.introduceTask(this);
    }

    public void setAssignedEmployee(Employee assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
    }

    public Employee getAssignedEmployee() {
        return assignedEmployee;
    }
}
