package JavaConcepts;

public class arrays {

    public static void main(String[] args) {
        /*
        Arrays are used to store multiple values of
        the same data type
         */
        int[] a = new int[5];
        a[0] = 7;
        a[1] = 2;
        a[2] = 9;
        a[3] = 0;
        a[4] = 1;

        char[] ch = {'a','b','c','d','e','f'};

        int len = a.length;

        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);

        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }

    }

}
