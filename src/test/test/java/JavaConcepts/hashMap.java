package JavaConcepts;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap();
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        hm.put(4,"d");
        hm.put(5,"e");
        hm.put(5,"f");
        hm.put(6,"f");
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.containsValue("x"));
        System.out.println(hm.containsKey(7));
        System.out.println(hm.isEmpty());
        System.out.println(hm.get(1));

        for(Map.Entry<Integer, String> m: hm.entrySet()){
            System.out.println(m.getKey()+"->"+m.getValue());
        }
    }
}
