package JavaPractice;

import java.util.ArrayList;

public class ArraylisttoArray {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        Integer[] arr=new Integer[al.size()];
        for(int i=0;i<al.size();i++)
        {
            arr[i]=al.get(i);
        }
        for(int i=0;i<al.size();i++)
        {
            System.out.println(arr[i]);
        }
    }
}
