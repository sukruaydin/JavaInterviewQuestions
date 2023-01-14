package triangle;

public class Pyramid_Up_Asteriks {

    public static void main(String[] args) {

        /*
                            *
                          * * *
                        * * * * *
                      * * * * * * *
                    * * * * * * * * *
         */

        /*
                each raw has --> raw*2 times asteriks
                at the beginning of each raw --> raw*2-numberOfRaw*2 times space
         */

        int raw = 7;

        for (int i = 1; i <= raw; i++) {
                System.out.print(" ".repeat((raw*2)-(i*2)));
                System.out.println("* ".repeat((i*2)-1));
        }


    }

}
