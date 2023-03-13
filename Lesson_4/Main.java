import Lesson_4.Shield.BigShield;
import Lesson_4.Shield.SmallShield;
import Lesson_4.Weapons.Bow;
import Lesson_4.Weapons.Sword;

public class Main {
    public static void main(String[] args) {
    
        Team<Swordmen> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordmen("Ragnar", 250, new Sword(25), new SmallShield(30,30)))
        .addWarriorToTeam(new Swordmen("Laki", 200, new Sword(30), new SmallShield(50, 30)));
        for (Swordmen swordmen : team1) {
            System.out.println(swordmen);
        }

        Team<Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Legolas", 150, new Bow (30,200), new BigShield(100)))
        .addWarriorToTeam(new Archer("Galadriel", 130, new Bow (20,250),new BigShield(150)));
        for (Archer archer : team2) {
            System.out.println(archer);
        }

        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());

        System.out.println(team1.minTeamArmor());
        System.out.println(team2.minTeamArmor());
    }
    
}