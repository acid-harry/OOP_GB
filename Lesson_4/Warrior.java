// Нулевой воин
public abstract class Warrior {
    private String  name;
    private int healthPoint;
    private Weaponable weapon;
    private Defendable defend;

    
    
    public Warrior(String name, int healthPoint, Weaponable weapon, Defendable defend) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.defend = defend;
    }
    public String getName() {
        return name;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public Weaponable getWeapon() {
        return weapon;
    }
    public Defendable getDefend() {
        return defend;
    }
    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    @Override
    public String toString() {
        return "Warrior [name = " + name + ", healthPoint = " + healthPoint + ", weapon = " + weapon + ", defend = " + defend + "]";
    }
    
}