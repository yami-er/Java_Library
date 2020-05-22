import java.util.*;
public class Megazine extends Periodical {
    int numberOfPages;
    public Megazine(String title,int numberOfCopy,String publishedFrequency, String type, String volume,int numberOfPages,List<Author> authors, List<PublishingCompany> publishingCompany){
        super(title, numberOfCopy, publishedFrequency, type, volume,authors,publishingCompany);
        this.numberOfPages= numberOfPages;
    }  
     //getter and setter 
     public int getNumberOfPages(){
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
       this.numberOfPages = numberOfPages;
    }
}