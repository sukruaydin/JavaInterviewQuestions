package find_unique;


public class FindUniqueChar_IndexOf_LastIndexOf {

    public static void main(String[] args) {

        String s = "aabbbşükrü";

        String result = "";

        for (int i = 0; i < s.length(); i++){
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                result += s.charAt(i);
            }
        }

        System.out.println("result = " + result);

    }

}
