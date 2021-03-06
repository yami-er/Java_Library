import java.util.*;
public class CardHolder {
public static void main(String[] args) {

    Author author1 = new Author("Mia", "James");
    Author author2 = new Author("Jack", "King");
    Author author3= new Author("Natalie", "Silver");
    PublishingCompany company1 = new PublishingCompany("ABC publishing company", "1234 E.John street");
    PublishingCompany company2 = new PublishingCompany("Classic publishing company", "8956 N.Trayon street");
    List <Author> authorsList = new ArrayList<Author>(); 
    List <PublishingCompany> companyList = new ArrayList<PublishingCompany>();
    authorsList.add(author1);
    authorsList.add(author2);
    authorsList.add(author3);
    companyList.add(company1);
    companyList.add(company2);

    //output for book class
    Book check = new Book("The beautiful ones are not yet born", "Ayi Kwei Armah",1961,24,3,false,true,authorsList,companyList);
    System.out.println("The title is " + check.getTitle());
    System.out.println("The author is " + check.getAuthorName());
    System.out.println("Year published is " + check.getYearPublished());
    System.out.println("Number of copy is "+ check.getNumberOfCopy());
    System.out.println("And the edition is "+ check.edition);
    System.out.println("The book is hardcover? " + true);
    System.out.println("The book is " + check.getUsed() + " used");
    System.out.println("How many days can the book be borrowed? "+check.loanDays());
    System.out.println("Is the book reservable? " +  check.reservable());
    System.out.println("Is the book loanable? " +  check.loanable());
    System.out.println("Authors: " +  check.getAuthors());


 

// output for newspaper
NewsPaper paper = new NewsPaper("New York Times" , 200 , "weekly", "general" , "4th" ,"James King",authorsList,companyList);
    System.out.println("The name of the news paper is " + paper.getTitle());
    System.out.println("Number of copy " + paper.getNumberOfCopy());
    System.out.println("The news paper is published " + paper.getPublishedFrequency());
    System.out.println("Type of the news paper is " + paper.getType());
    System.out.println("volume of the newspaper is "+ paper.getVolume());
    System.out.println("The editor of the news paper is "+ paper.getEditor());
    

  
   //output for audio and video
 Audio techno = new Audio("Nursary rhymes", 10, true, 1,authorsList,companyList); 
    System.out.println("The title of the video is " +techno.getTitle());
    System.out.println("We have "+ techno.getNumberOfCopy() +" number of copy");
    System.out.println("Is it high definition? " + techno.highDefinition);
    System.out.println("It is "+ techno.length + " hr" + " long");
    System.out.println("Is the audio reservable? " +  techno.reservable());
    System.out.println("Is the audio loanable? " +  techno.loanable());

    }

}