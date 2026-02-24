package estudosjava.basico.OOP.Entities;

public class Library {

    private String title;
    private String author;
    private int releaseYear;

    public Library(){}

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getReleaseYear(){
        return this.releaseYear;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setReleaseYear(int release){
        this.releaseYear = release;
    }
}
