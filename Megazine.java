public class Megazine extends Periodical {
    int numberOfPages;
    public Megazine(String title,int numberOfCopy,String publishedFrequency, String type, String volume,int numberOfPages){
        super(title, numberOfCopy, publishedFrequency, type, volume);
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