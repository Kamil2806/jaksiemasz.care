package task1.employees.canHire;

import task1.employees.Employee;
import task1.employees.TeamManager;

public interface CanHire {

    boolean canHire(Employee employee, TeamManager teamManager);
}
