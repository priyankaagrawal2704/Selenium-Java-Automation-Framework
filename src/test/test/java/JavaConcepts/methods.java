package JavaConcepts;/*
There are 2 types of methods:
void & return type method.

Methods are used to reduce duplication

DRY - Donot Repeat Yourself

O/P is any value that can be stored in a variable.
This O/P can be used anywhere else.
 */

public class methods {

    public void a(){
        System.out.println("void a");
    }

    public void sum(){
        System.out.println(1+2);
    }

    int sum2(){ //return type method
        System.out.println(1+2);
        return 1+2;
    }

    void vote(){ //no argument/parameter
        int age = 19;
        if(age>=18){
            System.out.println("Vote");
        }
        else{
            System.out.println("Dont Vote");
        }
    }

    void vote2(int age){ //argument/parameter
        //method body
        if(age>=18){
            System.out.println("Vote");
        }
        else{
            System.out.println("Dont Vote");
        }
    }

    void c(int x, float y){
        System.out.println(x+y);
    }

    void d(int x, float y, char c){
        System.out.println(x+y+c);
    }

    public static void e(){
        System.out.println("void e");
    }

    public static void main(String[] args) {
        methods m = new methods();
        m.a();
        m.sum();
        int x = m.sum2();
        m.vote();
        m.vote();
        m.vote();
        m.vote2(18);
        m.vote2(25);
        m.vote2(17);
        m.c(2,5);
        m.d(1,1.2f,'a');
//        m.d(1,'s');
//        int age = 19;
//        if(age>=18){
//            System.out.println("Vote");
//        }
//        else{
//            System.out.println("Dont Vote");
//        }
//        age = 20;
//        if(age>=18){
//            System.out.println("Vote");
//        }
//        else{
//            System.out.println("Dont Vote");
//        }
//        age = 25;
//        if(age>=18){
//            System.out.println("Vote");
//        }
//        else{
//            System.out.println("Dont Vote");
//        }
//        age = 30;
//        if(age>=18){
//            System.out.println("Vote");
//        }
//        else{
//            System.out.println("Dont Vote");
//        }
//        age = 40;
//        if(age>=18){
//            System.out.println("Vote");
//        }
//        else{
//            System.out.println("Dont Vote");
//        }
    }

}
