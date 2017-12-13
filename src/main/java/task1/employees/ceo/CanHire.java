package task1.employees.ceo;

import task1.employees.Employee;
import task1.employees.TeamManager;

public interface CanHire {

    boolean canHire(Employee employee, TeamManager teamManager);
}
