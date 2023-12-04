// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Author newAuthor = new Author("Lev", "Tolstoy");
        System.out.println(newAuthor.getName());
        System.out.println("newAuthor.family = " + newAuthor.getFamily());

        Book newBook = new Book("Childhood", newAuthor, 1996);
        System.out.println("newBook.getTitle = " + newBook.getTitle());
        System.out.println("newBook.getAuthor = " + newBook.getAuthor().getName() + ' ' + newBook.getAuthor().getFamily());
        System.out.println("newBook.title = " + newBook.getPublishYear());
        newBook.setPublishYear(2012);
        System.out.println("newBook.title = " + newBook.getPublishYear());
    }
}