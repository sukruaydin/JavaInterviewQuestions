package triangle;

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


    }

}
