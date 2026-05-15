public class ConsoleRenderer {

    public static void hpBar(String name, int hp) {
        System.out.print(name + " HP: [");

        for (int i = 0; i < 30; i += 3) {
            if (i < hp) System.out.print("█");
            else System.out.print("-");
        }

        System.out.println("] " + hp);
    }
}