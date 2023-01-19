import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

    public static void main(String[] args) {

        Integer[] number = {10,3,5,0,1,7,45,74,6};
        System.out.println(Arrays.toString(number));
        System.out.println("----------------------------------");

        //1st way -- ASCENDING ORDER
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println("----------------------------------");

        //2nd way -- ASCENDING ORDER
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(number));
        Integer[] sortedArr = new Integer[number.length];

        int k = 0;
        while (list.size()>0){
            Integer min = Collections.min(list);
            sortedArr[k++] = min;
            list.removeIf( p -> p==min);
        }
        System.out.println(Arrays.toString(sortedArr));
        System.out.println("----------------------------------");

        //3rd way -- DESCENDING ORDER
        Arrays.sort(number);

        Integer[] arr = new Integer[number.length];

        int m = 0;
        for (int i = number.length - 1; i >= 0; i--) {
            arr[m++] = number[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------");

        //4th way -- ASCENDING ORDER
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(number));
        Integer[] sortedArr2 = new Integer[number.length];

        int l = 0;
        while (list2.size()>0){
            Integer max = Collections.max(list2);
            sortedArr2[l++] = max;
            list2.removeIf( p -> p==max);
        }
        System.out.println(Arrays.toString(sortedArr2));





    }

}
