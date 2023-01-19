import java.util.Scanner;

public class ValidAge_WhileLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("enter age : ");
            int age = scan.nextInt();

            while ( ! (age>0 && age<120)){
                System.out.println("invalid age provided, please re-enter age :");
                age = scan.nextInt();
            }

            System.out.println("would you like to continue entering ? yes/no :");
            String a = scan.next().toLowerCase();

            while ( ! (a.equals("yes") || a.equals("no"))){
                System.out.println("invalid answer provided, please re-enter answer :");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")){
                return;
            }
        }


    }

}
