package lab9.prob3;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("0134685997", "Effective Java 3rd Edition", " Joshua Bloch");
        library.addBook("0132350882", "Clean Code: A Handbook of Agile Software Craftsmanship 1st Edition", "Robert C. Martin");
        library.addBook("0135957052", "The Pragmatic Programmer: Your Journey To Mastery", " David Thomas");
        library.addBook("0134685997", "Duplicated Book", " Joshua Bloch"); // Try to add existing book

        library.borrowBook("0132350889"); // Try to borrow non-existing book
        library.borrowBook("0132350882");
        library.borrowBook("0135957052");

        library.returnBook("0132350889"); // Try to return non-existing book
        library.returnBook("0134685997"); // Try to return existing book but not borrowed
        library.returnBook("0132350882"); // Try to return non-existing book

        String ISBN = "0132350882";
        System.out.printf("Book with ISBN %s is borrowed: %s \n \n", ISBN, library.isBookBorrowed(ISBN));

        Book book = library.getBookDetails("0135957052");
        if (book == null) {
            System.out.println("Book not found");
        } else {
            System.out.println(book);
        }

        System.out.println("All books:");
        library.listAllBooks();

        System.out.println("All borrowed books:");
        library.listBorrowedBooks();
    }
}
