package remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,10,10,20,30,10,40,50,40,50,50));

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
