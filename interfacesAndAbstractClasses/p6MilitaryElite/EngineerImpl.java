package p6MilitaryElite;

import java.util.HashSet;
import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer{

    Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        repairs = new HashSet<>();
    }

    public void addRepair(Repair repair) {
        //TODO ....
    }

    //TODO why in exercise it returns Collection
    public Set<Repair> getRepairs() {
        throw new IllegalStateException("TODO");
    }
}
