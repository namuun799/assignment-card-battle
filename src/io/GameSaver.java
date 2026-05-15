import java.io.*;

public class GameSaver {

    public static void save(Player p) throws Exception {
        FileWriter fw = new FileWriter("save.txt");
        fw.write(p.name + "," + p.hp + "," + p.mana);
        fw.close();
    }
}