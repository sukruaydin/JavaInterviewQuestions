package reverse;

import java.util.Arrays;

public class ReverseElementsInString {

    public static void main(String[] args) {
        /*
                reverse words in sentence
                input : Today is a good day to learn Java
                output : Java learn to day good a is Today
         */

        String s = "Today is a good day to learn Java";
        System.out.println(s);

        String[] result = new String[s.split(" ").length];
        int i = s.split(" ").length-1;

        for (String each : s.split(" ")) {
            result[i--] = each;
        }

        System.out.println(Arrays.toString(result));

    }

}
