import java.util.*;

public class FromMaxLengthToMinInSentence {

    public static void main(String[] args) {

        String s = "Oguz Cınarra is a big Bosssssss";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        System.out.println("list = " + list);



        //the easiest way
        /*Map<Integer,String> map = new TreeMap<>();
        for (String each : list) {
            map.put(each.length(),each);}

            System.out.println("map = " + map);*/





        //amale way
        Map<String,Integer> map = new LinkedHashMap<>();
        for (String each : list) {
            map.put(each,each.length());
        }
        System.out.println(map);


        while (map.size() > 0){
            int max = 0;

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue()>max){
                    max = entry.getValue();
                }
            }

            String key = "";
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == max){
                    System.out.println(entry.getKey()+" "+entry.getValue());
                    key = entry.getKey();
                }
            }

            map.remove(key);
            //System.out.println(map);
        }


    }

}
