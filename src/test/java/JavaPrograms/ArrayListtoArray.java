package JavaPrograms;

import java.util.ArrayList;

public class ArrayListtoArray {

    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(5);

   //     Integer[] arr=al.toArray(new Integer[0]);
        //for(Integer i: arr)
        //{
         //   System.out.println(i);
        //}

        Integer[] arr=new Integer[al.size()];
        for(int i=0;i<al.size();i++) {
            arr[i] = al.get(i);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
