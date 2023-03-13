package p6MilitaryElite;

import java.util.HashSet;
import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando{

    Set<Mission> missionSet;

    public CommandoImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        missionSet = new HashSet<>();
    }

    public void addMission(Mission mission) {
        //TODO
    }

    //TODO why in exercise it return Collection
    public Set<Mission> getMissions() {
        throw new IllegalStateException("TODO");
    }
}
