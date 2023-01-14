package find_unique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindDoubledChar_FrequencyMethod {

    public static void main(String[] args) {

        String s = "aabeebbışükrüll";

        //converting to arrayList to use frequency method
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));

        String result = "";

        for (String each : list) {

            if (result.contains(each)){
                continue;
            }

            if (Collections.frequency(list,each) == 2){
                result += each;
            }

        }

        System.out.println("result = " + result);


    }

}
