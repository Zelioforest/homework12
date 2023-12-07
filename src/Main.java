// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Author newAuthor = new Author("Lev", "Tolstoy");
        System.out.println(newAuthor.toString());


        Book newBook = new Book("Childhood", newAuthor, 1996);
        Book newBook1 = new Book("Spring", newAuthor, 2002);
        System.out.println(newBook.toString());
        System.out.println(newBook.equals(newBook1));
        System.out.println(newBook.hashCode());
        newBook.setPublishYear(2012);
        System.out.println(newBook.toString());
    }
}