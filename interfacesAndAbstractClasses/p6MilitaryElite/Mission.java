package p6MilitaryElite;

public class Mission {

    private String codeName;

    private enum State {
        inProgress, finished;
    }

    private State completeMission() {
        return State.finished;
    }

}
