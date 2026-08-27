package JavaConcepts;

public class ifCondition {
    public static void main(String[] args) {
        int a=2,b=3;

        if(a>b){ //if-block
            System.out.println("a>b");
        }
        if(a<b){
            System.out.println("a<b");
        }

        if(a==b){
            System.out.println("a==b");
        }
        else{
            System.out.println("a!=b");
        }

        if(a>=b){
            System.out.println("a>=b");
        }
        else if(a>b){
            System.out.println("a>b");
        }
        else if(a<=b){
            System.out.println("a<=b");
        }
        else if(a!=b){
            System.out.println("a!=b");
        }
        else{
            System.out.println("else block");
        }

        System.out.println("hello world!!");

    }
}
