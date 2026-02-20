package estudosjava.basico;

import java.util.Scanner;

public class SimpleSort {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            arr[i] = sc.nextInt();
        }

        int[] newArr = Sort(arr,arrayLength);
        for(int j = 0; j < arrayLength; j++){
            System.out.print(newArr[j] + " " );
        }
    }

    static int[] Sort(int[] arr, int n) {
        int aux;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    return arr;
    }


}
