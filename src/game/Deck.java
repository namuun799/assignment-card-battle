import java.util.*;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public void add(Card c) {
        cards.add(c);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.isEmpty()) return null;
        return cards.remove(0);
    }
}