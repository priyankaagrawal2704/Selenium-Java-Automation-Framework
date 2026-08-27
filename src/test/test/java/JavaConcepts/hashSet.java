package JavaConcepts;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('x');
        hs.add('1');
        hs.add('a');
        hs.add('A');
        hs.add('Z');
        hs.add(null);
        System.out.println(hs);
        for(Character a:hs){
            System.out.println(a);
        }
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains('Z'));
        System.out.println(hs.size());
        hs.remove('Z');
        Iterator<Character> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
