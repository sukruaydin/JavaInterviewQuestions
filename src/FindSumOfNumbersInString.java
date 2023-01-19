public class FindSumOfNumbersInString {

    public static void main(String[] args) {

        String s = "1ab5ct9h6";

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                // '0' --> 48
                sum += s.charAt(i)-48;
            }
        }

        System.out.println("sum = " + sum);


    }

}
