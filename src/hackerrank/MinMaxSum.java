package hackerrank;

import java.util.Scanner;

/**
 * Created by laerteguedes on 21/10/17.
 */
public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        minMaxSum(arr);
    }

    private static void minMaxSum(int[] arr) {

        int min = 0;
        int max = 0;
        int count = 0;
        int aux = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    aux = arr[j];
                    arr[i] = aux;
                    arr[j] = arr[i];
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            min += arr[i];
        }

        int count2 = 0;

        for (int i = arr.length - 1; count2 < 4; i--) {
            max += arr[i];
            count2++;
        }

        System.out.print(min + " " + max);
    }

}
