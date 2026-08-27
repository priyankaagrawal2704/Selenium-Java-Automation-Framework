package JavaConcepts;

public class variableScope {
    int i = 3; //instance variables
    static int s = 6; //static variable
    public static void main(String[] args) {
        int k = 5; //local variable
        if(k>0){
            int l = 1; //local variable
            System.out.println(k);
            System.out.println(l);
        }
        System.out.println(k);
//        System.out.println(l);
        //<className> <objectName> = new <className>();
        variableScope obj1 = new variableScope();
        System.out.println(obj1.i);
        System.out.println(obj1.j);
        System.out.println(++obj1.i);
        System.out.println(obj1.i);
        variableScope obj2 = new variableScope();
        System.out.println(obj2.i);
        System.out.println(++obj1.s);
        System.out.println(obj2.s);
    }
    int j = 4; //instance variables
}
/*
Instance Variable:
Declared inside a class but not inside any method/loop/block
or condition.
Can be accessed only with an object.

Local Variables:
Declared inside a class and also inside method/loop/block
or a condition.
Object should not be used here.

Static Variables:
Declared just like an instance variable but with the
keyword "static".
No need of Object.
 */

/*
India - Class
Indians - Objects
Aadhaar Card Number, PAN etc., - Instance Variables
Train Ticket, Movie Ticket - Local Variables
JEE, NEET Entrance Exams, National Anthem, Laws - Static Variables
 */