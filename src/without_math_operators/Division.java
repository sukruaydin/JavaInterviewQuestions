package without_math_operators;

public class Division {

    public static void main(String[] args) {

        int n1 = 37;
        int n2 = 6;

        int division = 0;

        while (n1 >= n2){
            n1 = n1 - n2;
            division++;
        }

        System.out.println("division = " + division + " with the remainder of " + n1);

    }

}
