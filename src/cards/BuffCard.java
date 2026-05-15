public class BuffCard extends Card {

    private int buff;

    public BuffCard(String name, int cost, int buff, Rarity rarity) {
        super(name, cost, rarity);
        this.buff = buff;
    }

    @Override
    public void play(Player self, Player enemy) {
        self.addAttack(buff);
    }
}