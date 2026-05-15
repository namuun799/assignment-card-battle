public abstract class Card {
    protected String name;
    protected int cost;
    protected Rarity rarity;

    public Card(String name, int cost, Rarity rarity) {
        this.name = name;
        this.cost = cost;
        this.rarity = rarity;
    }

    public int getCost() { return cost; }
    public String getName() { return name; }

    public abstract void play(Player self, Player enemy);
}