package task1.employees.ceo;

import task1.employees.TeamManager;
import task1.employees.canHire.CanHireFamale;
import task1.employees.canHire.CanHireGmail;

public class CeoGmail extends TeamManager {

    public CeoGmail(Builder teamManagerBuilder) {
        super(teamManagerBuilder);
        canHireType = new CanHireGmail();
    }
}
