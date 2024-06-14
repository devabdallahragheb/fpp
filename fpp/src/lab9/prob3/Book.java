package lab9.prob3;

public class Book {
    private final String ISBN;
    private final String title;
    private final String author;
    private boolean isBorrowed;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public String toString() {
        return STR."""
        Book = '\{ISBN}'
        Title = '\{title}'
        Author = '\{author}'
        isBorrowed = \{isBorrowed}
        """;
    }
}
