import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Player human = new HumanPlayer("You");
        Player ai = new AIPlayer("Bot");

        for (int i = 0; i < 5; i++) {
            human.deck.add(new AttackCard("Fire", 1, 3, Rarity.COMMON));
            ai.deck.add(new AttackCard("Fire", 1, 3, Rarity.COMMON));
        }

        Collections.shuffle(human.deck);
        Collections.shuffle(ai.deck);

        new Game(human, ai).start();
    }
}