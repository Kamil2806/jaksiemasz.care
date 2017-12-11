package task1.employees.canHire;

import task1.employees.Employee;
import task1.employees.TeamManager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CanHireGmail implements CanHire {

    @Override
    public boolean canHire(Employee employee, TeamManager teamManager) {
        Pattern pattern = Pattern.compile("[a-z0-9]+@gmail.com");
        Matcher matcher = pattern.matcher(employee.getEmail());
        if(teamManager.getNumOfEmployees() >= teamManager.getEmployees().size() && matcher.matches()) {
            return true;
        }
        else return false;
    }
}
