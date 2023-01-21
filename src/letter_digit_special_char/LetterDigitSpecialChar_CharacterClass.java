package letter_digit_special_char;

import java.util.Collections;

public class LetterDigitSpecialChar_CharacterClass {

    public static void main(String[] args) {

        /*
            print letters, digits, and special chars separately
            using Character class
         */

        String s = "?Woo9den8Spo,on&";

        char[] chars = s.toCharArray();

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (char each : chars) {
            if (Character.isLetter(each)){
                letters += each;
            } else if (Character.isDigit(each)) {
                digits += each;
            } else {
                specialChars += each;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);


    }

}
