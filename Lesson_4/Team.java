import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<E extends Warrior>  implements Iterable <E>{
    private List <E> team = new ArrayList<>();
    
    public Team<E> addWarriorToTeam(E person) {
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public int maxTeamRange(){
        int maxRange = 0;
        for( E item : team) {
            if(item instanceof Archer) {
                if(((Archer)item).shotRange() > maxRange) maxRange = ((Archer)item).shotRange();
            }
        }
        return maxRange;
    }

    public int  minTeamArmor(){
        int minArmor = 0;
        for (E item : team) {
            if(item instanceof Swordmen) {
                if(((Swordmen)item).shotArmor() > minArmor) minArmor = ((Swordmen)item).shotArmor();
            }
        }
        return minArmor;
    }
    
}