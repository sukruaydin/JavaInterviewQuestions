package zeros_to_end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ZerosToEnd_3_ArrayList {

    public static void main(String[] args) {

        //1st way -- çakal way
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0,5,0));
        System.out.println("list = " + list);

        int zeroCount = Collections.frequency(list,0);
        list.removeIf( p -> p==0);
        System.out.println("list = " + list);
        for (int i = 0; i < zeroCount; i++) {
            list.add(0);
        }
        System.out.println("list = " + list);
        System.out.println("--------------------------------------");

        //2nd way
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0,5,0));
        System.out.println("list1 = " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        int zeros = 0;

        for (Integer each : list1) {
            if (each != 0){
                list2.add(each);
            }else {
                zeros++;
            }
        }

        for (int i = 0; i < zeros; i++) {
            list2.add(0);
        }

        System.out.println("list2 = " + list2);



    }

}
