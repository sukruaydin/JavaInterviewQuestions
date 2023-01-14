package find_unique;

import java.util.ArrayList;
import java.util.Collections;

public class FindUniqueElement_RemoveIf {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("şükrü");
        names.add("ahmet");
        names.add("mehmet");
        names.add("ömer");
        names.add("yusuf");
        names.add("şükrü");
        names.add("alper");
        names.add("mehmet");
        names.add("şükrü");
        names.add("yusuf");
        System.out.println("names = " + names);

        names.removeIf( p -> Collections.frequency(names,p) > 1);
        System.out.println("names = " + names);


    }

}
