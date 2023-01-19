package merge;

import java.util.Arrays;

public class Merge_2_Arrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};

        int[] arrMerged = new int[arr1.length+arr2.length];

        int k = 0;

        //for 1st array
        for (int each : arr1) {
            arrMerged[k++] = each;
        }

        //for 2nd array
        for (int each : arr2) {
            arrMerged[k++] = each;
        }

        System.out.println(Arrays.toString(arrMerged));


    }

}
