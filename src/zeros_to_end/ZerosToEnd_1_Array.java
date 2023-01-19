package zeros_to_end;

import java.util.Arrays;

public class ZerosToEnd_1_Array {

    public static void main(String[] args) {

        int[] number = {10,0,5,0,1,0,45,74,0};

        int[] arrResult = new int[number.length];

        int k = 0;
        for (int each : number) {
            if (each == 0){
                continue;
            }
            arrResult[k++] = each;
        }

        System.out.println(Arrays.toString(arrResult));

    }

}
