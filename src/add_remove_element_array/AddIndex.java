package add_remove_element_array;

import java.util.Arrays;

public class AddIndex {

    public static void main(String[] args) {

        //add 5 as 2nd index

        int[] arr = {1,2,3,4};

        int[] arrAdded = new int[arr.length+1];

        int k = 0;

        for (int i = 0; i < arrAdded.length; i++) {
            if (i == 1){
                arrAdded[1] = 5;
                continue;
            }
            arrAdded[i] = arr[k++];
        }

        System.out.println(Arrays.toString(arrAdded));

    }

}
