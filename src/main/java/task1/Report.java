package task1;

import task1.Service.IntroducingService;

public class Report {

    private String description;

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
}

