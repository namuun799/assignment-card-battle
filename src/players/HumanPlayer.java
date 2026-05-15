import java.util.Scanner;

public class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public Card chooseCard() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n" + name + " HP: " + hp + " Mana: " + mana);

            for (int i = 0; i < hand.size(); i++) {
                System.out.println(i + ": " + hand.get(i).getName());
            }

            int idx = sc.nextInt();

            Card c = hand.get(idx);

            if (canPlay(c)) {
                mana -= c.getCost();
                return hand.remove(idx);
            }

            System.out.println("Not enough mana!");
        }
    }
}