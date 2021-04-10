package unit2.Assignment;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Name:Javed Ali\nUID:18BCS6705");
        Properties properties = new Properties();

        properties.setProperty("West Bengal", "Kolkata");
        properties.setProperty("Rajasthan", "Jodhpur");
        properties.setProperty("Bihar", "Patna");

        Set<Map.Entry<Object, Object>> set = properties.entrySet();
        Iterator<Map.Entry<Object, Object>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<Object, Object> me = it.next();
            System.out.println(me);
        }
    }
}
