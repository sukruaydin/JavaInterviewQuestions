package reverse;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {

    public static void main(String[] args) {

        /*
                reverse an ArrayList
                    input : 1,2,3,4,5
                    output : 5,4,3,2,1
         */

        Integer[] arr = {1,2,3,4,5};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversed.add(numbers.get(i));
        }

        System.out.println("reversed = " + reversed);
    }

}
