package palindrome;

public class IsPalindrome {

    public static void main(String[] args) {

        String s = "sukru";

        String reversed = "";
        for (int i = s.length()-1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        boolean flag = true;
        if ( ! (reversed.equalsIgnoreCase(s))){
            flag = false;
        }

        System.out.println("flag = " + flag);
    }

}
