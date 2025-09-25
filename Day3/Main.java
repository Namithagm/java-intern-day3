public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Create Books
        Book book1 = new Book("Java Basics", "James Gosling");
        Book book2 = new Book("OOP Concepts", "Grady Booch");
        Book book3 = new Book("Data Structures", "Robert Lafore");

        // Add Books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create Users
        User user1 = new User("Alice", 101);
        User user2 = new User("Bob", 102);

        // Add Users
        library.addUser(user1);
        library.addUser(user2);

        // Display all books
        library.displayBooks();

        // Issue a book
        library.issueBook("Java Basics", user1.getUserId());

        // Try issuing same book again
        library.issueBook("Java Basics", user2.getUserId());

        // Return a book
        library.returnBook("Java Basics");

        // Display books after operations
        library.displayBooks();
    }
}