package reverse;

import java.util.Arrays;

public class ReverseElementsInArray {

    public static void main(String[] args) {

        /*
                reverse elements
                output
                    nıdya ürküş
                    şat fusuy
                    nigne remö
                    şabka navilhep
         */

        String[] names = {"şükrü aydın","yusuf taş","ömer engin","pehlivan akbaş"};
        System.out.println(Arrays.toString(names));

        String[] reversed = new String[names.length];
        int j = 0;
        for (String each : names) {
            String result = "";
            for (int i = each.length()-1; i>=0; i--){
                result += each.charAt(i);
            }
            reversed[j++] = result;
        }

        System.out.println(Arrays.toString(reversed));

    }

}
