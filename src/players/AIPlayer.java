public class AIPlayer extends Player {

    public AIPlayer(String name) {
        super(name);
    }

    @Override
    public Card chooseCard() {

        Card best = null;

        for (Card c : hand) {
            if (canPlay(c)) {
                if (best == null || c.getCost() > best.getCost()) {
                    best = c;
                }
            }
        }

        if (best == null) return hand.remove(0);

        mana -= best.getCost();
        hand.remove(best);
        return best;
    }
}