//creating a parent class
public class LibraryItem {
    private String title, authorName, genre;
    private int yearPublished, numberOfCopy, edition;
    private boolean used, hardCover;

    LibraryItem(String title, String authorName,String genre, int yearPublished, int numberOfCopy,
    int edition, boolean used, boolean hardCover){
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
        this.yearPublished = yearPublished;
        this.numberOfCopy = numberOfCopy;
        this.edition = edition;
        this.used = used;
        this.hardCover= hardCover;
    }
    //getter
    public String getTitle(){
        return title;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getGenre(){
        return genre;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public int getNumberOfCopy(){
        return numberOfCopy;
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
   public void setTitle(String title){
       this.title = title;
   }
   public void setAuthor(String authourName){
    this.authorName = authourName;
   }
   public void setGenre(String genre){
    this.genre = genre;
   }
   public void setYearPublished(int yearPublished){
    this.yearPublished = yearPublished;
   }
   public void setNumberOfCopy(int numberOfCopy){
    this.numberOfCopy = numberOfCopy;
   }
   public void setEdition(int edition){
    this.edition= edition;
   }
}


