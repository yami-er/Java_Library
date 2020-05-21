public class ReferenceBook extends Book {
    //set new variable local
    String subject;
    public ReferenceBook(String title, String authorName, String subject, int yearPublished, int numberOfCopy,
    int edition, boolean used, boolean hardCover){
        super(title, authorName, yearPublished, numberOfCopy, edition, used, hardCover);
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
