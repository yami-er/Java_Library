public class Periodical extends LibraryItem{
    //adding the variable local to the periodical class(child class)
    private String publishedDuration;
    private String type;
        public Periodical(String title, String authorName, int yearPublished, int numberOfCopy,
        int edition, boolean used, boolean hardCover,String publishedDuration, string type){
            super(title, authorName, yearPublished, numberOfCopy, edition, used, hardCover);
            this.publishedDuration = publishedDuration;
            this.type = type;
        }

        //getters for the the local variables
        public String getPublishedDuration(){
            return publishedDuration;
        }
        public String getType(){
            return type;
        }
        //setters for the local variables
        public void setpublishedDuration(String publishedDuration){
            this.publishedDuration = publishedDuration;
        }
        public void setType(String type){
            this.type = type;
        }
    }
