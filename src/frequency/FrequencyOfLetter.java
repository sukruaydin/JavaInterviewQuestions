package frequency;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfLetter {

    public static void main(String[] args) {

        //1st way
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


        //2nd way
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
