package behavioral.command;

public class Soldier implements Cloneable{
    private boolean isDead;
    private boolean isDamaged;
    private int age;
    private String name;

    public Soldier(boolean isDead, boolean isDamaged, int age, String name) {
        this.isDead = isDead;
        this.isDamaged = isDamaged;
        this.age = age;
        this.name = name;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Soldier clone() throws CloneNotSupportedException {
        return (Soldier) super.clone();
    }
}
