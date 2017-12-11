package task1.employees;

import task1.enums.EnumRole;
import task1.enums.EnumStatus;
import task1.service.IntroducingService;


public class Developer extends AbstractEmployee {

    private Report report;
    private boolean isBusy = false;
    private Task task;

    private Developer() {}

    public Developer(DeveloperBuilder developerBuilder) {

        super(developerBuilder);
        this.report = developerBuilder.report;
        this.isBusy = developerBuilder.isBusy;
        ///this.task = developerBuilder.task;
    }

    @Override
    public void assign(Task task) {
        this.task = task;
        this.report.setDescription("Task: " + task.getTopic());
        this.report.setTask(task);
        this.isBusy = true;
    }

    public void setTaskStatus(EnumStatus enumStatus) {
        this.task.setStatus(enumStatus);
    }

    @Override
    public Report reportWork() { return report;}

    @Override
    public String toString() {
        return IntroducingService.introduceDeveloper(this);
    }

    public boolean getIsBusy() {
        return isBusy;
    }

    public void setIsBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }

    public static class DeveloperBuilder extends AbstractEmployeeBuilder<DeveloperBuilder> {

        private Report report;
        private boolean isBusy;
        private Task task;

        public DeveloperBuilder(String name, EnumRole role){
            super(name, role);
            this.report = new Report("NO REPORT");
            this.isBusy = false;
            //this.task = task;
        }

        @Override
        public Developer build() {
            return new Developer(this);
        }
    }
}