public class Periodical extends LibraryItem{
    //adding the variable local to the periodical class(child class)
    private String publishedFrequency;
    private String type;
    private String volume;

        public Periodical(String title,int numberOfCopy,
        String publishedFrequency, String type, String volume){
            super(title,numberOfCopy);
            this.publishedFrequency = publishedFrequency;
            this.type = type;
            this.volume = volume;
        }
        //getters for the the local variables
        public String getPublishedFrequency(){
            return publishedFrequency;
        }
        public String getType(){
            return type;
        }
        public String getVolume(){
            return volume;
        }
        //setters for the local variables
        public void setPublishedFrequency(String publishedFrequency){
            this.publishedFrequency = publishedFrequency;
        }
        public void setType(String type){
            this.type = type;
        }
        public void setVolume(String volume){
            this.volume = volume;
        }
        
}
    
