import java.util.*;
public class Audio extends LibraryItem{
    //add more variables for audio 
    boolean highDefinition;
    int length;
    public Audio(String title, int numberOfCopy,boolean highDefinition, int length,List<Author> authors, List<PublishingCompany> publishingCompany){
        super(title, numberOfCopy,authors,publishingCompany);
        this.highDefinition= highDefinition;
        this.length= length;
    }
    //getter and setter
    public boolean getHighDefinition(){
        return highDefinition;
    }
    public int getLength(){
        return length;
    }
    public void setHighDefinition(boolean highDefinition){
        this.highDefinition= highDefinition;
    }

    public void setLength(int length){
        this.length= length;
    }  
    //to override the loan day method from library item 
    @Override
    public int loanDays(){
      return super.loanDays() + 3;
    }
    //overriding interface
    @Override
    public boolean reservable(){
        return false;
    }  
}