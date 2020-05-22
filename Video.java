import java.util.*;
public class Video extends LibraryItem{
    //add more variables for video
    boolean highDefinition;
    boolean rated;
    boolean cartoon;
    public Video(String title, int numberOfCopy,boolean highDefinition, boolean rated, boolean cartoon, List<Author> authors, List<PublishingCompany> publishingCompany){
        super(title, numberOfCopy,authors,publishingCompany);
        this.highDefinition= highDefinition;
        this.rated = rated;
        this.cartoon = cartoon;
    }
    //getter and setter
    public boolean getHighDefinition(){
        return highDefinition;
    }
    public boolean getRated(){
        return rated;
    }
    public boolean getCartoon(){
        return cartoon;
    }
    public void setHighDefinition(boolean highDefinition){
        this.highDefinition= highDefinition;
    }

    public void setRated(boolean rated){
        this.rated= rated;
    } 
    public void setCartoon(boolean cartoon){
        this.cartoon= cartoon;
    }  
    //to override the loan day method from library item 
    @Override
    public int loanDays(){
      return super.loanDays() + 3;
    }
   
}
