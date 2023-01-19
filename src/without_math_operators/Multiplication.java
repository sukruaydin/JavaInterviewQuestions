package without_math_operators;

public class Multiplication {

    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 6;

        int result = 0;

        if (n1<0)
            throw new RuntimeException("n1 can NOT be less than 0");

        for (int i = 1; i <= n1; i++) {
            result += n2;
        }

        System.out.println("result = " + result);


    }

}
