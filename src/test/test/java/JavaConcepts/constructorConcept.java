package JavaConcepts;

import JavaConcepts.subPack.accessModifiers;

public class constructorConcept {
    /*
    A constructor is a piece of code
    which executes when an object is created

    A constructor looks like a method but it
    does not have any void or a return type

    A constructor's name is same as the class in which
    it is created.
     */

    int i = 5;

    constructorConcept(){
        System.out.println("Hi");
    }

    constructorConcept(int x){
        i = x;
        System.out.println(i);
    } //constructor overloading

    public static void main(String[] args) {
        constructorConcept cc = new constructorConcept();
        System.out.println(cc.i);
        constructorConcept cc2 = new constructorConcept(9);
        System.out.println(cc2.i);

//        simple ss = new simple();
//        ss.publicMethod();
        accessModifiers am = new accessModifiers();
        am.publicMethod();
//        am.defaultMethod();
    }
}


