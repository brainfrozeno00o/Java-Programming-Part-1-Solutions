
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are the same.
        if (this == compared) {
            return true;
        }

        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof Book)) {
            return false;
        }

        // let's cast the object to SimpleDate
        Book otherBook = (Book) compared;

        // if the object's values are the same, the objects are the same
        if (this.name.equals(otherBook.name)
                && this.publicationYear == otherBook.publicationYear) {
            return true;
        }

        // other wise, the objects are not the same
        return false;
    }    

}
