package min_max_average_array;

public class MinNumber {

    public static void main(String[] args) {

        int[] arr1 = {0, 1, 2, 3, -5, 40, 5, -18};

        int min = Integer.MAX_VALUE;

        for (int each : arr1) {
            if (each < min) {
                min = each;
            }
        }

        System.out.println("min = " + min);
    }

}
