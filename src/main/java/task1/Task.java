package task1;

import task1.Enum.EnumDestination;
import task1.Enum.EnumStatus;

public class Task {

    private final String topic;
    private final String description;
    private final EnumDestination Destination;
    private EnumStatus status;

    public Task(String topic, String description, EnumDestination roleDestination, EnumDestination destination, EnumStatus status) {
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

    public EnumDestination getDestination() {
        return Destination;
    }

    public EnumStatus getStatus() {
        return status;
    }

    public void setStatus(EnumStatus status) {
        this.status = status;
    }
}
