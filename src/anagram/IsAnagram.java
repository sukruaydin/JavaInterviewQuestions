package anagram;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {

        String s1 = "abcf";
        String s2 = "bfca";

        String[] a1 = s1.split("");
        String[] a2 = s2.split("");

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean equals = Arrays.equals(a1, a2);
        System.out.println("equals = " + equals);

    }

}
