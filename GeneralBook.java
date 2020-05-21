public class GeneralBook extends Book{
    //set new variable local
    String genre;
    public GeneralBook(String authorName,String genre, int yearPublished, int numberOfCopy,
    int edition, boolean used, boolean hardCover){
        super(authorName, yearPublished, numberOfCopy, edition, used, hardCover);
        this.genre = genre;
    }
    //getter & setter
    public String getgenre(){
        return genre;
    }
    public void setGenre(String genre){
       this.genre = genre;
    }
}