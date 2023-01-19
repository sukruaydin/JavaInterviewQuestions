package add_remove_element_array;

import java.util.Arrays;

public class RemoveIndex {

    public static void main(String[] args) {

        //remove 2nd index

        int[] arr1 = {10,72,3,43,5,6,7};

        int[] removed = new int[arr1.length-1];

        int k = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (i == 1){
                continue;
            }
            removed[k++] = arr1[i];
        }

        System.out.println(Arrays.toString(removed));

    }

}
