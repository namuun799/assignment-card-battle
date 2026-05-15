public class CreatureCard extends Card {

    private int attack;
    private int health;

    public CreatureCard(String name, int cost, int attack, int health, Rarity rarity) {
        super(name, cost, rarity);
        this.attack = attack;
        this.health = health;
    }

    @Override
    public void play(Player self, Player enemy) {
        enemy.takeDamage(attack);
    }

    public int getAttack() {
        return attack;
    }
}