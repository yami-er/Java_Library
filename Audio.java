public class Audio extends LibraryItem{
    //add more variables for audio 
    boolean highDefinition;
    int length;
    public Audio(String title, int numberOfCopy,boolean highDefinition, int length){
        super(title, numberOfCopy);
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
}