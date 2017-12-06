package task1;

import task1.Component.Employee;
import task1.Component.Manager;
import task1.Composite.TeamManager;
import task1.Enum.EnumRole;
import task1.Enum.EnumStatus;
import task1.Leaf.Developer;
import task1.Service.IntroducingService;

public class CompanyMain {

    public static void main(String[] args) {

        Manager ceo = new TeamManager("Kamil",
                EnumRole.CEO, 2);

        System.out.println("CREATE CEO");
        System.out.println(ceo);

        Manager developmentManager1 = new TeamManager("Bogdan",
                EnumRole.DEVELOPMENT_MANAGER, 2);

        Manager developmentManager2 = new TeamManager("Jacek",
                EnumRole.DEVELOPMENT_MANAGER, 2);

        System.out.println("CREATE TWO DEVELOPMENT MANAGER'S");
        System.out.println(developmentManager1);
        System.out.println(developmentManager2);

        ceo.hire(developmentManager1);
        ceo.hire(developmentManager2);

        System.out.println("HIRES TO DEVELOPMENT MANAGER'S BY CEO");
        System.out.println(ceo);

        Employee tester = new Developer("Maciek", EnumRole.TESTER);
        Employee contributor = new Developer("Franek", EnumRole.CONTRIBUTOR);
        Employee teamLeader = new Developer("Zdzichu", EnumRole.TEAM_LEADER);
        Employee developer = new Developer("Marian", EnumRole.DEVELOPER);

        developmentManager1.hire(tester);
        developmentManager1.hire(contributor);
        developmentManager2.hire(teamLeader);
        developmentManager2.hire(developer);

        System.out.println("HIRES TESTER AND CONTRIBUTOR BY DM1");
        System.out.println(developmentManager1);

        System.out.println("HIRES TEAM LEADER AND DEVELOPER BY DM2");
        System.out.println(developmentManager2);

        System.out.println("CREATE THREE TASKS");
        Task task1 = new Task("Website", "Do the website", EnumRole.DEVELOPER);
        Task task2 = new Task("Tests", "Do the tests", EnumRole.TESTER);
        Task task3 = new Task("Sth", "Do sth", EnumRole.TEAM_LEADER);
        System.out.println(Task.getTasks());

        System.out.println("ASSIGNED TASKS");
        ceo.assign(task1);
        System.out.println(developer);
        ceo.assign(task2);
        ceo.assign(task3);
        System.out.println(Task.getTasks());

        System.out.println(developer.reportWork());
        System.out.println(tester.reportWork());
        System.out.println(teamLeader.reportWork());

        developer.setTaskStatus(EnumStatus.IN_PROGRESS);
        System.out.println(Task.getTasks());
        System.out.println(developer.reportWork());
        System.out.println(Task.getTasks());

        developer.setTaskStatus(EnumStatus.FINISHED);
        System.out.println(developer);
        System.out.println(developer.reportWork());
        System.out.println(Task.getTasks());

        System.out.println(IntroducingService.introduceCompany((TeamManager)ceo));

        System.out.println(ceo.reportWork());
    }
}
