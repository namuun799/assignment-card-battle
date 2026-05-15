public class HealCard extends Card {

    private int heal;

    public HealCard(String name, int cost, int heal, Rarity rarity) {
        super(name, cost, rarity);
        this.heal = heal;
    }

    @Override
    public void play(Player self, Player enemy) {
        self.heal(heal);
    }
}