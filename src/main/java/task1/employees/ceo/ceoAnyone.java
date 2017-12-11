package task1.employees.ceo;

import task1.employees.TeamManager;
import task1.employees.canHire.CanHireAGH;
import task1.employees.canHire.CanHireAnyone;

public class ceoAnyone extends TeamManager {

    public ceoAnyone(Builder builder) {

        super(builder);
        setCanHireType(new CanHireAnyone());
    }

}
