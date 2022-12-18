package reverse;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        /*
            get a string from user
            print the reversed version of it
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string :");
        String s = scan.next();

        String reversed = "";
        for (int i = s.length()-1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        System.out.println("reversed = " + reversed);

    }

}
