package min_max_average_array;

public class Average {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int sum = 0;

        for (int each : arr) {
            sum += each;
        }

        double average = sum / arr.length;

        System.out.println("sum = " + sum);
        System.out.println("arr.length = " + arr.length);
        System.out.println("average = " + average);

    }

}
