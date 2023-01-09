import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shiritori shiritori = new Shiritori();
        try {
            shiritori.play("word");
            shiritori.play("draw");
            shiritori.printWords();
            shiritori.play("play");
            // shiritori.play("else");
            shiritori.restart();
            shiritori.printWords();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
