package Map;
import java.util.HashMap;

public class HashMap_Operations {
    public static void main(String[] args) {
        //create
        //Unorderd mapping
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1) - put(key, value)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Get - O(1) - get(key)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));

        //containsKey - O(1) - containsKey(key)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Inodonesia"));

        //Remove - O(1) - remove(key);
//        System.out.println(hm.remove("China"));
//        System.out.println(hm);

        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty()
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println(hm);

    }
}
