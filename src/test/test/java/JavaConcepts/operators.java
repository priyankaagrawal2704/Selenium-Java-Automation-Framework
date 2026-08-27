package JavaConcepts;

public class operators {
    public static void main(String[] args) {
        int a=2,b=3,c=4,d=5;
        float e = 3f;

        System.out.println("Addition: "+(a+b));
        System.out.println("Subtract: "+(d-c));
        System.out.println("Multiply: "+(a*c));
        System.out.println("Divide: "+(d/b));
        System.out.println(d/e);
        System.out.println("Modulus: "+(d%b));

        /*
        Increment:
        a=a+1 or a+=1 or a++ or ++a
        a=a+2 or a+=2

        Decrement:
        a=a-1 or a-=1 or a-- or --a
        a=a-2 or a-=2

        a=a*2 or a*=2

        a=a/2 or a/=2

        Pre-Increment: ++a
        Post-Increment: a++
         */

//        System.out.println(++a);
//        System.out.println(a++);
//        System.out.println(a);

//        System.out.println(++a+b+c+d);

        /*
        Relational Operators: >,<,>=,<=,==,!=
        '=' - Assignment Operator
        '==' - Equality Operator
         */

        /*
        Logical Operators: &&, ||
         */
        System.out.println(a<b);

        System.out.println((c>a)&&(d<b));

        //Ternary Operator

        boolean x = (2>3)?true:false;
        System.out.println(x);

        /*
        if(2>3)
        {
        x = true;
        }
        else{
        x = false;
        }
         */
    }
}
