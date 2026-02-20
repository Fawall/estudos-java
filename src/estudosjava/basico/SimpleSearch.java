package estudosjava.basico;

import java.util.Scanner;

public class SimpleSearch {

    static void main(){
        Scanner sc = new Scanner(System.in);

        int numeros;
        int[] values = new int[10];


        for(int i = 0; i < 10; i++){
            numeros = sc.nextInt();
            values[i] = numeros;
        }

        int busca = sc.nextInt();
        String resultado = Search(values,busca);
        System.out.println(resultado);
    }

    static String Search(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {

            if(array[i] == n){
                return "SIM";
            }
        }
        return "Não";
    }

}
