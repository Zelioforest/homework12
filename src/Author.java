import java.util.Objects;

public class Author {
    private String name;
    private String family;


    public Author(String name, String family) {
        this.name = name;
        this.family = family;
    }


    public String getFamily() {
        return this.family;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(family, author.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family);
    }

    @Override
    public String toString() {
        return "Author = " + name + ' ' + family;
    }
}
