package estudosjava.basico;

import java.util.Scanner;


public class Overflow {
    static void main(){
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int[] arr = new int[2];

        arr[0] = sc.nextInt();

        char Operator = sc.next().charAt(0);
        arr[1] = sc.nextInt();

        String result = Over(arr, Operator, value);
        System.out.println(result);

    }

    static String Over(int[] arr, char operator, int value){
            if(operator == '*'){
                int result = arr[0] * arr[1];
                if(result > value) {
                    return "OVERFLOW";
                }
            }
            if(operator == '+'){
                int result = arr[0] + arr[1];
                if(result > value){
                    return "OVERFLOW";
                }
            }
            return "OK";
    }
}
