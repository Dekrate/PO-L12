import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(new ArrayList<>() {{
            add(new Author("Jan", "Kowalski", "Polska"));
        }}, new ArrayList<>() {{
            add(new Title("Przygody Pana Muchomora", "Polski"));
            add(new Title("Tales of Mr Toadstool", "English"));
        }}, new ISBN("12345678901"), new DateOfProduction(2021, 12, 8), false);
        book.autograph();
    }
}
