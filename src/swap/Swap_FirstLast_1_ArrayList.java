package swap;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap_FirstLast_1_ArrayList {

    public static void main(String[] args) {

        /*
               swap first and last element manually
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("list = " + list);

        //storing first element in a container
        int a = list.get(0);

        //setting last element as 1st element
        list.set(0,list.get(list.size()-1));

        //setting first element as last element
        list.set(list.size()-1,a);

        System.out.println("list = " + list);

    }

}
