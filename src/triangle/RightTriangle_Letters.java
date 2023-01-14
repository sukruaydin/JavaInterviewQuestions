package triangle;

public class RightTriangle_Letters {

    public static void main(String[] args) {

        /*
                A
                B B
                C C C
                D D D D
                E E E E E
         */

        for (int i = 'A'; i <= 'E'; i++) {
            for (int j = 'A'; j <= 'E'; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

}
