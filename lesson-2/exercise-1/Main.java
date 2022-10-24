import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<mp3Player> mp3Players = new ArrayList<>() {{
            add(new mp3Player("Chinese", "Unknown", 1, new ArrayList<String>(){{
                add("wav");
                add("mp3");
            }}));
            add(new mp3Player("Panasonic", "PortableMP3Player", 10));
        }};

        System.out.println(mp3Players);
    }


    // zad phon
}
