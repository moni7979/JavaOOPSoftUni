package p6MilitaryElite;

public abstract class SoldierImpl implements Soldier{

    protected int id;
    protected String firstName;
    protected String lastName;

    public SoldierImpl(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
