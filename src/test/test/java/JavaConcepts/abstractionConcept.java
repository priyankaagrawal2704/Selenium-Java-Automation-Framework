package JavaConcepts;

abstract class classssss{
    /*
    Abstract class - contains abstract and concrete methods
    Concrete class - contains only concrete methods

    abstract method - method without body
    concrete method - method with body
     */

    abstract int a(); //fixed contract

    void b(){ //variable contract
        System.out.println("Concrete method");
    }

}

public class abstractionConcept extends classssss {

    int a(){ //overriding
        System.out.println("Void a");
        return 5;
    }

    public static void main(String[] args) {
        abstractionConcept abc = new abstractionConcept();
        abc.b();
        abc.a();
//        classssss c = new classssss();
        //We cant create an object for an abstract class

        /*
        Overriding is not possible for private methods
        Abstract methods cannot be private
         */
    }
}
