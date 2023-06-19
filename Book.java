package TES;

public class Book {
    private String Title;
    private String Author;
    private String Publisher;
    private int YearPublished;

    public Book(String Title, String Author, String Publisher, int YearPublished) {
        this.Title = Title;
        this.Author = Author;
        this.Publisher = Publisher;
        this.YearPublished = YearPublished; 
    }
    public String getTitle() {
        return Title;
    }
    public String getAuthor() {
        return Author;
    }
    public String getPublisher(){
        return Publisher;
    }
    public int getYearPublished(){
        return YearPublished;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }
    public void setYearPublished(int YearPublished) {
        this.YearPublished = YearPublished;
    }
    
}

