package frequency;

public class Frequency_Word_Substring {

    public static void main(String[] args) {

        String s = "Java java C# java jav";

        String a = "java";

        int count = 0;
        for (int i = 0; i <= (s.length()-a.length()); i++){
            if (s.substring(i,i+a.length()).equalsIgnoreCase(a)){
                count++;
            }
        }
        System.out.println("count = " + count);

    }

}
