public class AttackCard extends Card {

    private int damage;

    public AttackCard(String name, int cost, int damage, Rarity rarity) {
        super(name, cost, rarity);
        this.damage = damage;
    }

    @Override
    public void play(Player self, Player enemy) {
        enemy.takeDamage(damage + self.getAttackBuff());
    }
}