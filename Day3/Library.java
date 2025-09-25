import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Add a user
    public void addUser(User user) {
        users.add(user);
    }

    // Display all books
    public void displayBooks() {
        System.out.println("\nAvailable Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    // Issue a book
    public void issueBook(String title, int userId) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.issueBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    // Return a book
    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.returnBook();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
}  

