package task1;

import task1.Composite.TeamManager;
import task1.Enum.EnumRole;
import task1.Enum.EnumSex;

public class Task2Main {

    public static void main(String[] args) {

        TeamManager test = new TeamManager.TeamManagerBuilder(4)
                .employeeName("Kamil")
                .employeeRole(EnumRole.CEO)
                .academy("AGH")
                .email("kamil@wp.pl")
                .sex(EnumSex.MALE)
                .originCountry("Poland")
                .build();

        System.out.println(test);
    }

}
