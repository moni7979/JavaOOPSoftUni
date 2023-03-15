package p6MilitaryElite;

import java.util.HashSet;
import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando{

    Set<Mission> missionSet;
    Corps corps;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        missionSet = new HashSet<>();
        this.corps = corps;
    }


    public void addMission(Mission mission) {
        //TODO
    }

    //TODO why in exercise it return Collection
    public Set<Mission> getMissions() {
        throw new IllegalStateException("TODO");
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s %s Id: %d Salary: %.2f", firstName, lastName, id, salary));
        sb.append(System.lineSeparator());
        sb.append("Corps: TODO");
        sb.append(System.lineSeparator());
        sb.append("Missions:");
        sb.append(System.lineSeparator());
        missionSet.stream().forEach(m -> sb.append(m.toString() + System.lineSeparator()));
        return String.valueOf(sb);
    }

}
