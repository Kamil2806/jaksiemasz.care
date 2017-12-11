package task1.employees.canHire;

import task1.employees.Employee;
import task1.employees.TeamManager;
import task1.enums.EnumSex;

public class CanHireMale implements CanHire {

    @Override
    public boolean canHire(Employee employee, TeamManager teamManager) {
        if(teamManager.getNumOfEmployees() >= teamManager.getEmployees().size() &&
                employee.getSex() == EnumSex.MALE) {
            return true;
        }
        else return false;
    }
}
