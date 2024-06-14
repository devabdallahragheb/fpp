package lab9.prob3;

import java.util.HashMap;

public class Library {
    private final HashMap<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(String ISBN, String title, String author) {
        if (books.containsKey(ISBN)) {
            System.out.printf("ISBN: %s exists in the library \n", ISBN);
        } else {
            Book newBook = new Book(ISBN, title, author);
            books.put(ISBN, newBook);
            System.out.println("New book has been added to the library");
            System.out.println(newBook);
        }
    }

    public void borrowBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.printf("ISBN: %s does not exist in the library \n", ISBN);
        } else {
            book.setBorrowed(true);
            books.put(ISBN, book);
            System.out.println("Book has been borrowed: ");
            System.out.println(book);
        }
    }

    public void returnBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.printf("ISBN: %s does not exist in the library \n", ISBN);
        } else if (book.isBorrowed()) {
            book.setBorrowed(false);
            books.put(ISBN, book);
            System.out.println("Book has been returned: ");
            System.out.println(book);
        } else {
            System.out.println("Book exists in the library but has not been borrowed yet \n");
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.printf("ISBN: %s does not exist in the library \n", ISBN);
            return false;
        } else {
            return book.isBorrowed();
        }
    }

    public Book getBookDetails(String ISBN) {
        return books.get(ISBN);
    }

    public void listAllBooks() {
        books.forEach((_, book) -> {
            System.out.println(book);
        });
    }

    public void listBorrowedBooks() {
        books.forEach((_, book) -> {
            if (book.isBorrowed()) {
                System.out.println(book);
            }
        });
    }
}
