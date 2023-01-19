package add_remove_element_array;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        //remove 43

        int[] arr1 = {10,72,3,43,5,6,7};

        int[] newArr = new int[arr1.length-1];

        int k = 0;

        for (int each : arr1) {
            if (each == 43){
                continue;
            }
            newArr[k++] = each;
        }

        System.out.println(Arrays.toString(newArr));

    }

}
