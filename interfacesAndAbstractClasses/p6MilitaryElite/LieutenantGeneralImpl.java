package p6MilitaryElite;

import java.util.HashSet;
import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral{

    Set<PrivateImpl> privatesSet;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        privatesSet = new HashSet<>();
    }

    public void addPrivate(PrivateImpl privatee) {}


    @Override
    public Set<PrivateImpl> getSet() {
        return null;
    }
}
