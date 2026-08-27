package JavaConcepts;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
//        ArrayList<Object> al = new ArrayList();
        ArrayList<Integer> al  =new ArrayList<>();
        al.add(7);
        al.add(3);
        al.add(7);
        al.add(0);
        al.add(2);
        System.out.println(al);
        System.out.println(al.size());
        al.remove(2);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(2));
        System.out.println(al.isEmpty());
        System.out.println(al.contains(6));
        for(int i=0;i< al.size();i++){
            System.out.println(al.get(i));
        }
        System.out.println("================");
        for(Integer x: al){
            System.out.println(x);
        }
    }
}
