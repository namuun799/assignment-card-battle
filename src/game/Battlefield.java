import java.util.*;

public class Battlefield {
    public List<CreatureCard> creatures = new ArrayList<>();

    public void add(CreatureCard c) {
        creatures.add(c);
    }

    public void attack(Player enemy) {
        for (CreatureCard c : creatures) {
            enemy.takeDamage(c.getAttack());
        }
    }
}