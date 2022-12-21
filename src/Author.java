import java.util.Objects;

public class Author {
    private String authorFirstName;
    private String authorMiddleName;
    private String authorLastName;


    public Author(String authorFirstName, String authorMiddleName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorMiddleName = authorMiddleName;
        this.authorLastName = authorLastName;

    }


    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getAuthorMiddleName() {
        return this.authorMiddleName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }

    @Override
    public boolean equals(Object theAuthor) {
        if (this == theAuthor) return true;
        if (theAuthor == null || getClass() != theAuthor.getClass()) return false;
        Author author = (Author) theAuthor;
        return authorFirstName.equals(author.authorFirstName) && authorMiddleName.equals(author.authorMiddleName) && authorLastName.equals(author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorMiddleName, authorLastName);
    }

    @Override
    public String toString() {
        return "Автор: " +
                "Имя - " + authorFirstName +
                " ,Отчество - " + authorMiddleName +
                " ,Фамилия - " + authorLastName ;
    }
}
