import Lesson_4.Shield.BigShield;
import Lesson_4.Weapons.Bow;

// Лучник 
public class Archer extends Warrior {

    public Archer(String name, int healthPoint, Bow bow, BigShield bigShield) {
        super(name, healthPoint, bow, bigShield);
    }

    @Override
    public String toString() {
        return "Archer " + super.toString();
    }

    public int shotRange(){
        return ((Bow) getWeapon()).getRange();
    }

}