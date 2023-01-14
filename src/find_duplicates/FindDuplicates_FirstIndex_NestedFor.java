package find_duplicates;

public class FindDuplicates_FirstIndex_NestedFor {

    public static void main(String[] args) {

        String s = "asdffgg";

        for (int i = 0; i < s.length(); i++){
            for (int j = i+1; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j)){
                    System.out.println("first duplicated element : " + s.charAt(i));
                    System.out.println("first duplicated index : " + i);
                    return;
                }
            }
        }


    }

}
