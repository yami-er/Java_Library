//creating a parent class
public class LibraryItem {
    private String title;
    private int numberOfCopy;
  
    LibraryItem(String title,int numberOfCopy){
        this.title = title;
        this.numberOfCopy = numberOfCopy;
    }
    //getter
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

}


