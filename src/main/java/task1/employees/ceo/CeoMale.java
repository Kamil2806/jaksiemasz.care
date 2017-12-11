package task1.employees.ceo;

import task1.employees.TeamManager;
import task1.employees.canHire.CanHireMale;

public class CeoMale extends TeamManager {


    public CeoMale(Builder teamManagerBuilder) {
        super(teamManagerBuilder);
        canHireType = new CanHireMale();
    }
}
