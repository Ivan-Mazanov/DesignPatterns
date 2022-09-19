package behavioral.command;


import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CommandHistory {
    private final LinkedList<Command> history = new LinkedList<>();

    public void execute(Command command, Soldier soldier){
        history.addLast(command);
        command.backupSoldier(soldier);
        command.doSomething();
    }
}
