package JavaConcepts;

public class exceptionHandling1 {

    public static void main(String[] args) {
        int x = 4;
        System.out.println("Hi");
        System.out.println(0/x);
        try {
            System.out.println(x/0);
            System.out.println("jheyyyyyyy");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        finally{
            System.out.println("Finally block");
        }
        /*
        Finally block will execute no matter the
        exception is handled or not
         */
        System.out.println("Hello world!!!");
    }
}
/*
Unchecked Exceptions: Due to code issues.

Checked Exceptions:
 */