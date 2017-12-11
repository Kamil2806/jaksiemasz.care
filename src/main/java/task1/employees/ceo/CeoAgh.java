package task1.employees.ceo;

import task1.employees.TeamManager;
import task1.employees.canHire.CanHireAGH;

public class CeoAgh extends TeamManager {

    public CeoAgh(Builder builder) {

        super(builder);
        setCanHireType(new CanHireAGH());
    }

}
