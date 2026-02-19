package estudosjava.basico;

import java.util.Scanner;

public class Fibonacci {

    static int Fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
            return Fib(n-1) + Fib(n-2);
        }

    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int valor = Fib(n);

        System.out.println(valor);

    }

}



