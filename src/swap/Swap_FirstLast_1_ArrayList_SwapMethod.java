package swap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap_FirstLast_1_ArrayList_SwapMethod {

    public static void main(String[] args) {

        /*
               swap first and last element using  Collections.swap() method
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("list = " + list);

        Collections.swap(list,0,list.size()-1);
        System.out.println("list = " + list);


    }

}
