public class GeneralBook extends Book{
    //set new variable local
    String genre;
    public GeneralBook(String title,String authorName, int yearPublished, int numberOfCopy,
    int edition, boolean used, boolean hardCover,String genre){
        super(title, authorName, yearPublished, numberOfCopy, edition, used, hardCover);
        this.genre = genre;
    }
    //getter & setter
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
       this.genre = genre;
    }
    //to ovverride the method inherited from book
    @Override
    public int loanDays(){
      return super.loanDays() + 7;
    }
}