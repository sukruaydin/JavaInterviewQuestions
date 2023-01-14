package frequency;

public class Frequency_Letter_WhileFor {

    public static void main(String[] args) {
        /*
                result = a4b2c1
         */

        String s = "aaabbca";

        //3rd way -- FOR+WHILE LOOP
        String re = "";
        for (int i = 0; i < s.length(); i++){
            String h = s;
            int count = 0;
            while (h.contains(""+s.charAt(i))){
                h = h.replaceFirst(""+s.charAt(i),"");
                count++;
            }
            if (re.contains(""+s.charAt(i))){
                continue;
            }
            re += ""+s.charAt(i)+count;
        }
        System.out.println("re = " + re);


    }

}
