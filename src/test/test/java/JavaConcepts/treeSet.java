package JavaConcepts;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("x");
        ts.add("a");
        ts.add("ABC");
        ts.add("1");
        ts.add("x");
        ts.add("A");
//        ts.add(null);
        System.out.println(ts);
        for(String a:ts){
            System.out.println(a);
        }
        System.out.println(ts.isEmpty());
        System.out.println(ts.contains('Z'));
        System.out.println(ts.size());
        ts.remove('Z');
    }
}
