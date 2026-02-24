package estudosjava.basico.OOP.Services;

import estudosjava.basico.OOP.Entities.Library;

public class LibraryService {
    static void main() {
        Library library = new Library();

        library.setTitle("Biblioteca da meia noite");
        library.setAuthor("Matt Haig");
        library.setReleaseYear(2020);

        System.out.println("Nome do livro: " + library.getTitle() + "\nAutor: " + library.getAuthor() +
                "\nAno de : " + library.getReleaseYear());
    }
}

