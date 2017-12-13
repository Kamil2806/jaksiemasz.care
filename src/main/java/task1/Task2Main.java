package task1;

import task1.employees.*;
import task1.enums.EnumRole;
import task1.enums.EnumSex;

public class Task2Main {

    public static void main(String[] args) {

        //Use Logger !!!!!!
        //random string - apache commons + guava
        //defensywne kopiowanie
        //unsafe class

        Manager test1 = new TeamManager.Builder(4, "Kamil", EnumRole.CEO)
                .academy("AGH")
                .email("kamil@wp.pl")
                .sex(EnumSex.MALE)
                .originCountry("Poland")
                .build();

        Manager test2 = new TeamManager.Builder(1, "Bogdan", EnumRole.CEOGMAIL)
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
                .email("kamiloki@wp.com")
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

        System.out.println(test2);
    }
}
