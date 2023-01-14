package remove_duplicates;

public class RemoveDuplicates_String {

    public static void main(String[] args) {

        String s = "aaabbacb";

        String result = "";

        for (int i = 0; i < s.length(); i++){
            if (result.contains(""+s.charAt(i))){
                continue;
            }
            result += ""+ s.charAt(i);
        }

        System.out.println("result = " + result);

    }

}
