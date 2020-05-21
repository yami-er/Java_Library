public class NewsPaper extends Periodical {
    String editor;
    public NewsPaper(String title,int numberOfCopy,String publishedFrequency, String type, String volume,String editor){
            super(title, numberOfCopy, publishedFrequency, type, volume);
             this.editor = editor;
        
        }
        //getter and setter 
        public String getEditor(){
            return editor;
        }
        public void setEditor(String editor){
           this.editor = editor;
        }
        //override the method inherited from periodical(periodical inherited from library item)
        @Override
    public int loanDays(){
      return super.loanDays() - 5;
    }
}