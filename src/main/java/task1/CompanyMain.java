package task1;

import task1.Component.Employee;
import task1.Component.Manager;
import task1.Composite.TeamManager;
import task1.Enum.EnumRole;
import task1.Leaf.Developer;

public class CompanyMain {

    public static void main(String[] args) {

        Manager ceo = new TeamManager("Kamil",
                EnumRole.CEO, 2);

        System.out.println(ceo);

        Manager developmentManager1 = new TeamManager("Bogdan",
                EnumRole.DEVELOPMENT_MANAGER, 2);

        Manager developmentManager2 = new TeamManager("Jacek",
                EnumRole.DEVELOPMENT_MANAGER, 2);

        ceo.hire(developmentManager1);
        ceo.hire(developmentManager2);

        System.out.println(ceo);

        Employee tester = new Developer("Maciek", EnumRole.TESTER);
        Employee contributor = new Developer("Franek", EnumRole.CONTRIBUTOR);
        Employee teamLeader = new Developer("Zdzichu", EnumRole.TEAM_LEADER);
        Employee developer = new Developer("Marian", EnumRole.DEVELOPER);

        developmentManager1.hire(tester);
        developmentManager1.hire(contributor);
        developmentManager2.hire(teamLeader);
        developmentManager2.hire(developer);

        System.out.println(ceo);
        System.out.println(developmentManager1);
        System.out.println(developmentManager2);


    }
}
