package reverse;

import java.util.Arrays;

public class Reverse2DArray {

    public static void main(String[] args) {

        /*
                expected result :
                //{ {13,12,11..}, {7,6,5..}, {3,2,1} }
         */

        int [] arr1 ={1,2,3};
        int [] arr2 ={4,5,6,7};
        int [] arr3 ={8,9,10,11,12,13};

        //creating a 2D array for storing them
        int[][] arr = new int[3][];
        arr[0] = arr1;
        arr[1] = arr2;
        arr[2] = arr3;
        System.out.println(Arrays.deepToString(arr));

        //creating reversed result
        int[][] reversed = new int[arr.length][];

        int j = arr.length-1;

        for (int[] arr1D : arr) {
            int[] result = new int[arr1D.length];
            int k = 0;
            for (int i = arr1D.length-1; i >= 0 ; i--) {
                result[k++] = arr1D[i];
            }

            reversed[j--] = result;
        }

        System.out.println(Arrays.deepToString(reversed));


    }

}
