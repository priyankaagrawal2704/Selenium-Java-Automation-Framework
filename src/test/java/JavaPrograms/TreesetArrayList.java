package JavaPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreesetArrayList {

    public static void main(String[] args) {
          TreeSet<String> ts= new TreeSet<>();
          ts.add("Java");
          ts.add("Python");
          ts.add("Selenium");

        /*ArrayList<String> al=new ArrayList<>(ts);*/

         ArrayList<String> al=new ArrayList<>();
         for(String s:ts)
         {
             al.add(s);
         }

         System.out.println(al);
    }
}
