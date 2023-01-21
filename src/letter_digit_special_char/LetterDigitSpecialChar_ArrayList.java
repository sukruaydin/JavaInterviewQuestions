package letter_digit_special_char;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LetterDigitSpecialChar_ArrayList {

    public static void main(String[] args) {

        /*
            print letters, digits, and special chars separately
            using ArrayList
         */

        String s = "?Woo9den8Spo,on&";

        ArrayList<Character> list = new ArrayList<>();

        for (char each : s.toCharArray()) {
            list.add(each);
        }

        //letters
        ArrayList<Character> letters = new ArrayList<>(list);
        letters.removeIf( p -> ! Character.isLetter(p));
        System.out.println("letters = " + letters);

        //digits
        ArrayList<Character> digits = new ArrayList<>(list);
        digits.removeIf( p -> ! Character.isDigit(p));
        System.out.println("digits = " + digits);

        //specialChars
        ArrayList<Character> specialChars = new ArrayList<>(list);
        specialChars.removeIf( p -> Character.isLetterOrDigit(p));
        System.out.println("specialChars = " + specialChars);


    }

}
