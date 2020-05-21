public class Book extends LibraryItem{

    String authorName;
    int yearPublished; 
    int edition;
    boolean used; 
    boolean hardCover;

    public Book(String title, String authorName, int yearPublished, int numberOfCopy,
    int edition, boolean used, boolean hardCover){
        super(title, numberOfCopy);
        this.authorName = authorName;
        this.yearPublished = yearPublished;
        this.edition = edition;
        this.used = used;
        this.hardCover = hardCover;
    }
    //getter
    public String getAuthorName(){
        return authorName;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public int getEdition(){
        return edition;
    }
    public boolean getUsed(){
        return used;
    }
    public boolean getHardCover(){
        return hardCover;
    }
    //setter
    public void setAuthorName(String authourName){
    this.authorName = authourName;
    }
    public void setYearPublished(int yearPublished){
    this.yearPublished = yearPublished;
    }
    public void setEdition(int edition){
    this.edition= edition;
    }
    public void setUsed(String used){
    this.used = used;
    }
    public void setHardCover(String hardCover){
    this.hardCover = hardCover;
    }

}