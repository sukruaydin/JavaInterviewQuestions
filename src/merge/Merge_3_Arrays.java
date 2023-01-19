package merge;

import java.util.Arrays;

public class Merge_3_Arrays {

    public static void main(String[] args) {

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int[] arr4 = new int[arr1.length + arr2.length + arr3.length];

        int k = 0;

        //1st array
        for (int each : arr1) {
            arr4[k++] = each;
        }

        //2nd array
        for (int each : arr2) {
            arr4[k++] = each;
        }

        //3rd array
        for (int each : arr3) {
            arr4[k++] = each;
        }

        System.out.println(Arrays.toString(arr4));


    }

}
