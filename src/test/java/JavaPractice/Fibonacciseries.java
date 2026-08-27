package JavaPractice;

public class Fibonacciseries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum=0;
        while(a<=50)
        {
            System.out.print(a+" ");
            sum=sum+a;
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println("Sum of 1 to 50 fibonacci no is:"+sum);
    }
}
