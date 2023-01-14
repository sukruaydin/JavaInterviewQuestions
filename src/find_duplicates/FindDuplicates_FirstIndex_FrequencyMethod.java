package find_duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindDuplicates_FirstIndex_FrequencyMethod {

    public static void main(String[] args) {

        /*
               find first duplicated char's index
         */

        String s = "asdffgg";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));

        for (String each : list) {
            if (Collections.frequency(list,each) == 2){
                System.out.println("first duplicated element : " + each);
                System.out.println("first duplicated index : "+list.indexOf(each));
                return;
            }
        }

    }

}
