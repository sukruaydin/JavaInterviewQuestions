package remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates_Array {

    public static void main(String[] args) {

        int[] arr = {1,1,2,3,4,4,5,2,3};

        //putting the array into arrayList for easy iteration
        ArrayList<Integer> list = new ArrayList<>();

        //since it was created by "int" instead of "Integer", we can NOT use asList method
        for (int each : arr) {
            list.add(each);
        }

        ArrayList<Integer> removedDuplicates = new ArrayList<>();

        for (Integer each : list) {
            if (removedDuplicates.contains(each)){
                continue;
            }
            removedDuplicates.add(each);
        }

        System.out.println("removedDuplicates = " + removedDuplicates);



    }

}
