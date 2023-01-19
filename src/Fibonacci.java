public class Fibonacci {

    public static void main(String[] args) {

        /*
            print first n fibonacci numbers
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89

            0 1 1
            1 1 2
            1 2 3
            2 3 5
            3 5 8
         */

        int n = 8;

        int x = 0;
        int y = 1;

        String result = x+" "+y+" ";

        for (int i = 1; i <= n-2 ; i++) {

            int sum = x+y;
            result += sum+" ";
            x = y;
            y = sum;

        }

        System.out.println(result);

    }

}
