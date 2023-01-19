package add_remove_element_array;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        //add 5

        int[] arr = {1,2,3,4};

        int[] arrAdded = new int[arr.length+1];

        int k = 0;

        for (int each : arr) {
            arrAdded[k++] = each;
        }

        arrAdded[k] = 5;

        System.out.println(Arrays.toString(arrAdded));

    }

}
