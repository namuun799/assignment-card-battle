import java.util.*;

public abstract class Player {

    protected String name;
    protected int hp = 30;
    protected int mana = 0;

    // 🔥 ATTACK BUFF SYSTEM (FINAL)
    protected int attackBuff = 0;

    public List<Card> hand = new ArrayList<>();
    public List<Card> deck = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    // =========================
    // BASIC SYSTEM
    // =========================

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int dmg) {
        hp -= dmg;
    }

    public void heal(int amount) {
        hp = Math.min(30, hp + amount);
    }

    // =========================
    // MANA SYSTEM
    // =========================

    public void addMana() {
        mana = Math.min(10, mana + 1);
    }

    public boolean canPlay(Card c) {
        return mana >= c.getCost();
    }

    // =========================
    // ATTACK BUFF SYSTEM (FIXED)
    // =========================

    public int getAttackBuff() {
        return attackBuff;
    }

    public void addAttack(int value) {
        attackBuff += value;
    }

    // =========================
    // DECK SYSTEM
    // =========================

    public void draw() {
        if (!deck.isEmpty()) {
            hand.add(deck.remove(0));
        }
    }

    // =========================
    // ABSTRACT
    // =========================

    public abstract Card chooseCard();
}