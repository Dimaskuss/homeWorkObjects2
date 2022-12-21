import java.util.Objects;

public class Book {

    private String bookName;
    private Author bookAuthor;
    private int bookYear;


    public Book(String bookName, Author bookAuthor, int bookYear) {
        this.bookName = bookName;
        this.bookYear = bookYear;
        this.bookAuthor = bookAuthor;

    }

    public Author getBookAuthor() {
        return bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public boolean equals(Object bookType) {
        if (this == bookType) return true;
        if (bookType == null || getClass() != bookType.getClass()) return false;
        Book book = (Book) bookType;
        return bookYear == book.bookYear && bookName.equals(book.bookName) && bookAuthor.equals(book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthor, bookYear);

    }

    @Override
    public String toString() {
        return
                "Название - " + bookName +
                ", " + bookAuthor +
                ", Год выпуска - " + bookYear;
    }
}
