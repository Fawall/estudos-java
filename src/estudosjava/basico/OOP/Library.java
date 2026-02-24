package estudosjava.basico.OOP;

public class Library {

    private String BookName;
    private String Actor;
    private int Release;

    public String GetBookName(){
        return this.BookName;
    }
    public String GetActor(){
        return this.Actor;
    }
    public int GetRelease(){
        return this.Release;
    }

    public void SetBookName(String bookName){
        this.BookName = bookName;
    }
    public void SetActor(String actor){
        this.Actor = actor;
    }
    public void SetRelease(int release){
        this.Release = release;
    }
}


class CreateLibrary {
     static void main(){
        Library library = new Library();

        library.SetBookName("Biblioteca da meia noite");
        library.SetActor("Ator");
        library.SetRelease(1900);

        System.out.println("Nome do livro: " + library.GetBookName() + "\nAtor: " + library.GetActor() +
                "\nAno de : " + library.GetRelease());
    }


}