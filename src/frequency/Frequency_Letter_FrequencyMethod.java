package frequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frequency_Letter_FrequencyMethod {

    public static void main(String[] args) {
        /*
                result = a4b2c1
         */

        String s = "aaabbca";

        String result2 = "";
        //going for array
        String[] arr = s.split("");
        //going for arrayList to use frequency method
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if (result2.contains(each)){
                continue;
            }
            result2 += "" + each + frequency;
        }
        System.out.println("result2 = " + result2);

    }

}
