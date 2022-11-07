import java.util.ArrayList;

public class Book {
    private final ArrayList<Author> authors;
    private final ArrayList<Title> titles;
    private final ISBN ISBN;
    private final DateOfProduction dateOfProduction;
    private boolean autograph;

    public Book(ArrayList<Author> authors, ArrayList<Title> titles, ISBN ISBN, DateOfProduction dateOfProduction, boolean autograph) {
        this.authors = authors;
        this.titles = titles;
        this.ISBN = ISBN;
        this.dateOfProduction = dateOfProduction;
        this.autograph = autograph;
    }

    private void autograph() {
        autograph = true;
    }


}
