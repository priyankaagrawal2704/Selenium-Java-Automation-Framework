package JavaPrograms;

import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] arr={"Java","Selenium","API"};

      //  ArrayList<String> al=new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            al.add(arr[i]);

        }
        System.out.println(al);
    }
}
