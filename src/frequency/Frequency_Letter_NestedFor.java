package frequency;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frequency_Letter_NestedFor {

    public static void main(String[] args) {

        /*
                result = a4b2c1
         */

        //1st way -- NESTED FOR LOOP
        String s = "aaabbca";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }

            if (result.contains(""+s.charAt(i))){
                continue;
            }

            result += ""+s.charAt(i)+count;
        }
        System.out.println("result = " + result);


    }

}
