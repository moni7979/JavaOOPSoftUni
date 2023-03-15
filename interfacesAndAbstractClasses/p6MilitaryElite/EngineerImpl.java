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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", firstName, lastName, id, salary));
        sb.append(System.lineSeparator());
        sb.append("Corps: TODO");
        sb.append(System.lineSeparator());
        sb.append("Repairs:");
        sb.append(System.lineSeparator());
        repairs.stream().forEach(r -> sb.append(r));
        return String.valueOf(sb);
    }
}
