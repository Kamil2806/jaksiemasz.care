package task1;

import task1.Enum.EnumRole;
import task1.Enum.EnumStatus;

public class Task {

    private final String topic;
    private final String description;
    private final EnumRole Destination;
    private EnumStatus status;

    public Task(String topic, String description, EnumRole roleDestination, EnumRole destination, EnumStatus status) {
        this.topic = topic;
        this.description = description;
        this.status = status;
        this.Destination = roleDestination;
    }

    public String getTopic() {
        return topic;
    }

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
}
