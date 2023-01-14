package FINRA;

public class RegularFINRA {

    public static void main(String[] args) {

        /*
            print,
            if number is divisible by 3 -> print FIN,
            if number is divisible by 5 -> print RA,
            if number is divisible by both 3 and 5 -> print FINRA,
            none of them -> print the number
        */

        int number = 7;

        if (number%15==0){
            System.out.println("FINRA");
        } else if (number%5==0) {
            System.out.println("RA");
        } else if (number%3==0) {
            System.out.println("FIN");
        }else {
            System.out.println(number);
        }

    }

}
