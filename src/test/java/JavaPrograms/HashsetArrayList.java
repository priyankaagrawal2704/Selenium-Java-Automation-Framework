package JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetArrayList {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
       // ArrayList<Integer> al = new ArrayList<>(hs);
        ArrayList<Integer> al=new ArrayList<>();

        for(Integer i:hs)
        {
            al.add(i);
        }
        System.out.println(al);
    }
}