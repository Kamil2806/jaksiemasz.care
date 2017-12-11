package task1.employees.ceo;

import task1.employees.TeamManager;
import task1.employees.canHire.CanHireFamale;
import task1.employees.canHire.CanHireMale;

public class CeoFamale extends TeamManager {


    public CeoFamale(Builder teamManagerBuilder) {
        super(teamManagerBuilder);
        canHireType = new CanHireFamale();
    }
}
