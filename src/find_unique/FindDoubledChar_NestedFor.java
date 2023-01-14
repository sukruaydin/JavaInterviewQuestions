package find_unique;

public class FindDoubledChar_NestedFor {

    public static void main(String[] args) {

        String s = "aabeebbışükrüll";

        String result = "";

        for (int i = 0; i < s.length(); i++){
            int count = 0;
            for (int j = 0; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }

            if (count != 2 || result.contains(""+s.charAt(i))){
                continue;
            }

            result += s.charAt(i);
        }

        System.out.println("result = " + result);

    }

}
