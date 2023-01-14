package frequency;

public class Frequency_Char {

    public static void main(String[] args) {

        String s = "aabbbbc";
        char ch = 'b';

        int count = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("count = " + count);


    }

}
