package triangle;

public class Pyramid_Down_Asteriks {

    public static void main(String[] args) {

        /*

                     * * * * * * * * *
                       * * * * * * *
                         * * * * *
                           * * *
                             *
         */

        int raw = 6;

        for (int i = raw; i >= 1; i--) {
            System.out.print(" ".repeat((raw*2)-(i*2)));
            System.out.println("* ".repeat(i*2-1));
        }

    }

}
