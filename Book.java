public class Book extends LibraryItem{
    public Book(String title, String authorName,String genre, int yearPublished, int numberOfCopy,
    int edition, boolean used, boolean hardCover){
        super(title, authorName, genre, yearPublished, numberOfCopy, edition, used, hardCover);
    }
}