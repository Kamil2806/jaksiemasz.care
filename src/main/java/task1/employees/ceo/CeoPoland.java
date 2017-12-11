package task1.employees.ceo;

import task1.employees.TeamManager;
import task1.employees.canHire.CanHireFamale;
import task1.employees.canHire.CanHirePol;

public class CeoPoland extends TeamManager {


    public CeoPoland(Builder teamManagerBuilder) {
        super(teamManagerBuilder);
        canHireType = new CanHirePol();
    }
}
