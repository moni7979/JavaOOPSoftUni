package word;

public class Initialization {
    public static CommandInterface buildCommandInterface(StringBuilder text) {
        CommandImpl commandInterface = new ExtendedCommandInterface(text);
        commandInterface.init();
        return commandInterface;
    }
}
