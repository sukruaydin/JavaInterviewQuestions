public class FindCommonElements {

    public static void main(String[] args) {

        int[] n1 = {1,2,3,4,5,4};
        int[] n2 = {4,5,6,7,8,1};

        String result = "";
        for (int i : n1) {
            for (int j : n2) {
                if (i == j && ! (result.contains(""+i))){
                    result += i+" ";
                }
            }
        }
        System.out.println("result = " + result);

    }

}
