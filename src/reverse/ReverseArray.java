package reverse;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        /*
            get from user how many element he wants to enter
            reverse and print the array
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("how many element will you enter : ");
        int l = scan.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));



        int[] reversed = new int[l];
        int k = 0;
        for (int i = l-1; i >= 0; i--){
            reversed[k++] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));

    }

}
