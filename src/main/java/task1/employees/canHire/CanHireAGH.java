package task1.employees.canHire;

import task1.employees.Employee;
import task1.employees.TeamManager;

public class CanHireAGH implements CanHire{

    @Override
    public boolean canHire(Employee employee, TeamManager teamManager) {
        if(teamManager.getNumOfEmployees() >= teamManager.getEmployees().size() &&
                employee.getAcademy() == "AGH") {
            return true;
        }
        else return false;
    }
}
