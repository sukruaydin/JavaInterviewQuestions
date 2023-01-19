package min_max_average_array;

public class MaxNumber {

    public static void main(String[] args) {

        int[] arr1 = {0,1,2,3,-5,40,5,18};

        int max = Integer.MIN_VALUE;

        for (int each : arr1) {
            if (each>max){
                max=each;
            }
        }

        System.out.println("max = " + max);
    }

}
