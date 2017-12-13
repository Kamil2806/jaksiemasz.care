package task1.employees.ceo;

import task1.enums.EnumSex;

import java.util.regex.Pattern;

public class CeoPredicates {

        public static CanHire canHireAGH = ((employee, teamManager) ->
                teamManager.getNumOfEmployees() >= teamManager.getEmployees().size()
                && employee.getAcademy() == "AGH");

        public static CanHire canHireMale = (((employee, teamManager) ->
                teamManager.getNumOfEmployees() >= teamManager.getEmployees().size()
                        && employee.getSex() == EnumSex.MALE ));

        public static CanHire canHireFamale = (((employee, teamManager) ->
                teamManager.getNumOfEmployees() >= teamManager.getEmployees().size()
                        && employee.getSex() == EnumSex.FAMALE ));

        public static CanHire canHirePoland = ((employee, teamManager) ->
                teamManager.getNumOfEmployees() >= teamManager.getEmployees().size()
                        && employee.getOriginCountry().equalsIgnoreCase("Poland"));

        public static CanHire canHireGmail = ((employee, teamManager) ->
                teamManager.getNumOfEmployees() >= teamManager.getEmployees().size()
                        && Pattern.matches("[a-z0-9]+@gmail.com", employee.getEmail()));

        public static CanHire canHIreAnyone = (((employee, teamManager) ->
                teamManager.getNumOfEmployees() >= teamManager.getEmployees().size()));
    }

