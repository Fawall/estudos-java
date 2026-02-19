package estudosjava.basico;

import java.util.Scanner;

public class HelloWorld
{
    static void main(){
        Scanner stringScanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String cor = stringScanner.next();
        System.out.println(cor);
        // Scanner.next() -> serve para ler a primeira palavra digitada.

        /*
        * É útil, após a leitura de tipos diferentes, colocar um nextLine() vazio, para limpar o buffer
        */

        stringScanner.nextLine();

        System.out.println("Digite uma frase");
        String frase = stringScanner.nextLine();
        System.out.println(frase);



    }

}
