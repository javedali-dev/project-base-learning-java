package unit2.Assignment;

import java.util.Iterator;
import java.util.TreeSet;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Name:Javed Ali\nUID:18BCS6705");
        TreeSet<String> set = new TreeSet<>();
        //Collection<String> set = new TreeSet<>(Collections.reverseOrder());
        set.add("Bob");
        set.add("Alice");
        set.add("John");
        set.add("Richard");

        Iterator<String> it = set.iterator();
        String query = "John";
        boolean result = false;

        while (it.hasNext()) {
            if (it.next().equals(query)) {
                result = true;
                break;
            }
        }

        if (result) System.out.println(query + " exists");
        else System.out.println(query + " doesn't exist");

    }
}
