package TES;

import java.util.Scanner;
import java.sql.Statement;

public class FictionBook extends Book{
    private String Type;
    private String Genre;
    Scanner sc = new Scanner(System.in);

    public FictionBook(String Title, String Author, String Publisher, int YearPublished, String Type, String Genre){
        super(Title, Author, Publisher, YearPublished);
        this.Type = Type;
        this.Genre = Genre;
    }
    public String getType(){
        return Type;
    }
    public String getGenre(){
        return Genre;
    }
    public static void cls(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    
    public void uploadtoDB(String Title, String Author, String Publisher, int YearPublished, String Type, String Genre){
        super.setTitle(Title);
        super.setAuthor(Author);
        super.setPublisher(Publisher);
        super.setYearPublished(YearPublished);
        this.Type = Type;
        this.Genre = Genre;
        cls();
        System.out.println("The book you are uploading is : ");
        System.out.println("Title          :"+Title);
        System.out.println("Author         :"+Author);
        System.out.println("Publisher      : "+Publisher);
        System.out.println("Year Published : "+YearPublished);
        System.out.println("Type           : "+Type);
        System.out.println("Genre          : "+Genre);
        System.out.println("\nPress enter to confirm...");
        sc.nextLine();
        try {
            Statement st = DBConnector.connection.createStatement();
            String query = "INSERT INTO books(Title, Author, Publisher, YearPublished, Type, Genre, Topic) VALUES ('"+Title+"','"+Author+"','"+Publisher+"','"+YearPublished+"','"+Type+"','"+Genre+"','')";
            st.execute(query);
            System.out.println("Successfully uploaded the book to the database");
            System.out.println("\nPress enter to continue...");
            sc.nextLine();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void upload(String Title, String Author, String Publisher, int YearPublished, String Type, String Genre){
        FictionBook fictionBook = new FictionBook(Title, Author, Publisher, YearPublished, Type, Genre);
        fictionBook.uploadtoDB(Title,  Author,  Publisher,  YearPublished,  Type,  Genre);
    }
}
