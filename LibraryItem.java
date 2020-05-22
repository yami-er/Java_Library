
import java.util.*; 
//creating a parent class
public class LibraryItem implements LibraryInterface{
    private String title;
    private int numberOfCopy;
    //declaring private to create relationship
    private List<Author> authors;
    private List<PublishingCompany> publishingCompany;

    LibraryItem(String title,int numberOfCopy, List<Author> authors, List<PublishingCompany> publishingCompany){
        this.title = title;
        this.numberOfCopy = numberOfCopy;
        this.authors = authors;
        this.publishingCompany = publishingCompany;
    }
    //getter
    public String getAuthors(){
        String authorName ="";
        for (Author a:authors){
            authorName += a.firstName +" "+ a.lastName +";";
        }
        return authorName;
    }

    public List <PublishingCompany> getPublishingCompany(){
        return publishingCompany;
    }
    public String getTitle(){
        return title;
    }
    public int getNumberOfCopy(){
        return numberOfCopy;
    }
    
    //setter
   public void setTitle(String title){
       this.title = title;
   }
   public void setNumberOfCopy(int numberOfCopy){
    this.numberOfCopy = numberOfCopy;
   }
   //creating a method to set the amount of loan days
   public int loanDays(){
       return 7;
   }
   //implementing the interface to check if item can be reserved
    public boolean reservable(){
        return true;
    } 
    public boolean loanable(){
        return true;
    }

}


