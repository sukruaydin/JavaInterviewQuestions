package swap;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap_GivenElements_MethodWriting {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("list = " + list);

        ArrayList<Integer> swap = swapIndexes(list, 1, 4);
        System.out.println("swap = " + swap);

    }

    public static ArrayList<Integer> swapIndexes(ArrayList<Integer> list, int index1, int index2){

        if (index1<0 || index1>=list.size() || index2<0 || index2>=list.size()){
            throw new RuntimeException("Given index is out of bounds");
        }
        int a = list.get(index1);
        list.set(index1,list.get(index2));
        list.set(index2,a);

        return list;
    }

}
