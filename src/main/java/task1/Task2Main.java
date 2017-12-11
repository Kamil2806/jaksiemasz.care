package task1;

import task1.employees.*;
import task1.employees.ceo.CeoAgh;
import task1.enums.EnumRole;
import task1.enums.EnumSex;

public class Task2Main {

    public static void main(String[] args) {

        Manager test1 = new TeamManager.Builder(4, "Kamil", EnumRole.CEO)
                .academy("AGH")
                .email("kamil@wp.pl")
                .sex(EnumSex.MALE)
                .originCountry("Poland")
                .build();

        Manager test2 = new CeoAgh.Builder(4, "Bogdan", EnumRole.CEO)
                .academy("AGH")
                .email("kamil@wp.pl")
                .sex(EnumSex.MALE)
                .originCountry("Poland")
                .build();

        Employee employee1 = new Developer.DeveloperBuilder("Maciek", EnumRole.DEVELOPER)
                .academy("UJ")
                .sex(EnumSex.MALE)
                .email("kamiloki@gmail.com")
                .build();

        Employee employee2 = new Developer.DeveloperBuilder("Bogdan", EnumRole.DEVELOPER)
                .academy("AGH")
                .sex(EnumSex.FAMALE)
                .email("kamiloki@gmail.com")
                .build();

        Employee employee3 = new Developer.DeveloperBuilder("Filip", EnumRole.DEVELOPER)
                .academy("UR")
                .sex(EnumSex.MALE)
                .email("kamiloki@gmail.com")
                .build();

        Employee employee4 = new Developer.DeveloperBuilder("Magda", EnumRole.DEVELOPER)
                .academy("UE")
                .sex(EnumSex.FAMALE)
                .email("kamiloki@gmail.com")
                .build();

        test2.hire(employee1);
        test2.hire(employee2);
        test2.hire(employee3);
        test2.hire(employee4);

        System.out.println(test2);

        Task task1 = new Task("1", "Do sth1", EnumRole.DEVELOPER);
        Task task2 = new Task("2", "Do sth2", EnumRole.DEVELOPER);
        Task task3 = new Task("3", "Do sth3", EnumRole.DEVELOPER);
        Task task4 = new Task("4", "Do sth4", EnumRole.DEVELOPER);

        test2.assign(task1);
        test2.assign(task2);
        test2.assign(task3);
        test2.assign(task4);

//        System.out.println(task1);
//        System.out.println(employee1);
//        System.out.println(Task.getTasks());

        System.out.println(test2.reportWork());
    }
}
