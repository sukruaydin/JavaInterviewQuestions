package find_unique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindUniqueChar_FrequencyMethod {

    public static void main(String[] args) {

        String s = "aabbbışükrüll";

        //converting to arrayList to use frequency method
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));

        String result = "";

        for (String each : list) {
            if (Collections.frequency(list,each) == 1){
                result += each;
            }
        }

        System.out.println("result = " + result);

    }

}
