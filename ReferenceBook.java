import java.util.*;
public class ReferenceBook extends Book {
    //set new variable local
    String subject;
    public ReferenceBook(String title, String authorName, String subject, int yearPublished, int numberOfCopy,
    int edition, boolean used, boolean hardCover,List<Author> authors, List<PublishingCompany> publishingCompany){
        super(title, authorName, yearPublished, numberOfCopy, edition, used, hardCover,authors,publishingCompany);
        this.subject = subject;
    }
    //getter & setter
   public String getSubject(){
       return subject;
   }
   public void setSubject(String subject){
      this.subject = subject;
   }
}
