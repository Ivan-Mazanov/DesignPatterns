package behavioral.command;

public abstract class Command {
    private Soldier backup;
    public abstract void doSomething();

    public void backupSoldier(Soldier soldier){
        try {
            backup = soldier.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public Soldier getBackup() {
        return backup;
    }
}
