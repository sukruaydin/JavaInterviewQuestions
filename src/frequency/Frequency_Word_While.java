package frequency;

public class Frequency_Word_While {

    public static void main(String[] args) {

        String s = "Java java C# java java";
        s = s.toLowerCase();
        String w = "java";

        int count = 0;
        while (s.contains(w)){
            s = s.replaceFirst(w,"");
            count++;
        }

        System.out.println("count = " + count);

    }

}
