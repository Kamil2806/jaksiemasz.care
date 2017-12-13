package task1.employees;

import task1.service.IntroducingService;

public class Report {

    private String description;
    private Task task;

    public Report(String description) {
        this.description = description;
    }

    public String getDescription() { return description; }

    @Override
    public String toString() {
        return IntroducingService.introduceReport(this);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Task getTask(){
        return this.task;
    }
}

