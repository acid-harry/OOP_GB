import Lesson_4.Shield.SmallShield;
import Lesson_4.Weapons.Sword;

// Меченосец
public class Swordmen extends Warrior {

    public Swordmen(String name, int healthPoint, Sword sword, SmallShield smallShield ) {
        super(name, healthPoint, sword, smallShield);
    }

    @Override
    public String toString() {
        return "Swordmen" + super.toString();
    }
    
    public int shotArmor(){
        return ((SmallShield)getDefend()).getArmor();
    }
 
}