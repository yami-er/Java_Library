import java.util.*;
public class Book extends LibraryItem{

    String authorName;
    int yearPublished; 
    int edition;
    boolean used; 
    boolean hardCover;

    public Book(String title, String authorName, int yearPublished, int numberOfCopy,
    int edition, boolean used, boolean hardCover, List<Author> authors, List<PublishingCompany> publishingCompany){
        super(title, numberOfCopy,authors,publishingCompany);
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
    public void setUsed(boolean used){
    this.used = used;
    }
    public void setHardCover(boolean hardCover){
    this.hardCover = hardCover;
    }
    //to override the method from library item
    @Override
    public int loanDays(){
      return super.loanDays() + 7;
    }
    //to override the interface
    @Override
    public boolean reservable(){
        return false;
    }  

}