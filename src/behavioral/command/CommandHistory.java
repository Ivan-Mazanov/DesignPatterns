package behavioral.command;


import java.util.LinkedList;

public class CommandHistory {
    private final LinkedList<Command> history = new LinkedList<>();

    public void execute(Command command, Soldier soldier){
        history.addLast(command);
        command.backupSoldier(soldier);
        command.doSomething();
    }

    public Soldier undo(){
        Soldier backup = history.getLast().restoreBackup();
        history.removeLast();
        return backup;
    }
}
