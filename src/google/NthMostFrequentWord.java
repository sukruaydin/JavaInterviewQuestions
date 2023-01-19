package google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthMostFrequentWord {

    public static void main(String[] args) {

        String s = "a a a a a a a Please use this phone to call to me emre emre emre ş ş ş ş";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));

        int e = 2;

        for (int i = 1; i <= e ; i++) {

            int count = 0;
            String result = "";
            for (String each : list) {
                int freq = Collections.frequency(list,each);
                if (freq > count){
                    count = freq;
                    result = each;
                }
            }
            System.out.println(result + " " +count);
            ArrayList<String> listRemoved = new ArrayList<>();
            for (String each : list) {
                if(!(each.equalsIgnoreCase(result))){
                    listRemoved.add(each);
                }
            }
            list = listRemoved ;

        }



    }

}
