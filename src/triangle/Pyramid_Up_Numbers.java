package triangle;

import java.util.Scanner;

public class Pyramid_Up_Numbers {

    public static void main(String[] args) {

        /*
                            1
                          2 3 2
                        3 4 5 4 3
                      4 5 6 7 6 5 4
                    5 6 7 8 9 8 7 6 5
         */

        int raw = 5;

        for (int i = 1; i <= raw; i++) {
            System.out.print(" ".repeat(raw*2-i*2));
            int k = i;
            for (int j = 1; j <= i*2-1; j++) {
                if (j<i){
                    System.out.print((k++)+" ");
                }else {
                    System.out.print((k--)+" ");
                }
            }
            System.out.println();
        }

        /*

        EMRE KARAKUŞ WAY

        int numbersOfLine = 5;
        int number = 1;
        int middleNumber = 1;
        boolean condition = true;

        for (int i = 1; i <= numbersOfLine; i++) {
            for (int j = 0; j < (2 * numbersOfLine) - (2 * i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                if (number <= middleNumber && condition) {
                    System.out.print(number + " ");
                    number++;

                } else {
                    if (number - 1 == middleNumber) {
                        number--;
                    }
                    condition = false;
                    number--;
                    System.out.print(number + " ");
                }
            }
            System.out.println();
            number = i + 1;
            middleNumber += 2;
            condition = true;
        }*/


    }

}
