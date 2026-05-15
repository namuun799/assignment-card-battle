public class Game {

    Player p1;
    Player p2;

    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {

        while (p1.isAlive() && p2.isAlive()) {

            playTurn(p1, p2);
            if (!p2.isAlive()) break;

            playTurn(p2, p1);
        }

        System.out.println("Winner: " + (p1.isAlive() ? p1.name : p2.name));
    }

    void playTurn(Player a, Player b) {

        a.addMana();
        a.draw();

        if (!a.hand.isEmpty()) {
            Card c = a.chooseCard();
            c.play(a, b);
        }

        System.out.println(b.name + " HP: " + b.hp);
    }
}