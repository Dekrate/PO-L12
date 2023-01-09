import java.util.ArrayList;

public class Shiritori {
    private ArrayList<String> strings = new ArrayList<>();


    public void play(String name) throws Exception {
        if (strings.isEmpty()) {
            strings.add(name);
        } else {
            String lastWord = strings.get(strings.size() - 1);
            String lastLetter = lastWord.substring(lastWord.length() - 1);
            if (strings.contains(name)) {
                throw new Exception(lastLetter + " has already been used");
            }
            if (name.startsWith(lastLetter)) {
                strings.add(name);
            } else {
                throw new Exception(name + " does not begin with " + lastLetter);
            }
        }
    }
    public void restart() {
        strings = new ArrayList<>();
    }
    
    public void printWords() {
        System.out.println(strings.toString());
    }
}
