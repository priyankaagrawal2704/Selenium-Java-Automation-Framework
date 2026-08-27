package JavaConcepts;

public class whileDoWhile {

    public static void main(String[] args) {
        int i=0, j=0;
        int count=0;
        while(i<5){
            System.out.println(i);
            i++; //end of iteration
            count++;
        }
        System.out.println("Count: "+count);
        System.out.println("======");
        do{
            System.out.println(j);
            j++;
        }while (j>5);
    }
}
