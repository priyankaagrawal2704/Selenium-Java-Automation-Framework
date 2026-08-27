package JavaConcepts;

public class forEachLoop {
    public static void main(String[] args) {
        /*
        For Each loop can be used only
        along with a data structure like
        Arrays, Lists, Maps etc.,
         */

        float[] a = {4.5f,6.2f,8f,0.2f,1.9f};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("========");
        for(float b:a){
            System.out.println(b);
        }
    }
}
