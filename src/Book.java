import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publishYear;

    public Book(String title, Author author, int publishYear){
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor(){
        return this.author;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    @Override
    public String toString() {
        return "Book: " +
                "title = " + title +
                ", " + author.toString() +
                ", publishYear = " + publishYear;
    }
}
