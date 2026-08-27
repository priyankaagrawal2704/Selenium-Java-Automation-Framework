package JavaConcepts;

class sampleClass {
    int x = 5;

    public void a(){
        System.out.println("Void a");
    }
}

class sampleClass2{

}

public class inheritance1 extends sampleClass{
    /*
    sampleClass - Parent/Super Class
    inheritance1 - Child/Sub class
     */

    int y = 6;

    public void a(){
        System.out.println("Overridden method");
    }

    public static void main(String[] args) {
        inheritance1 i1 = new inheritance1();
        System.out.println(i1.x);
        sampleClass i2 = new inheritance1();
        i1.a();
        i2.a();
    }
}

/*
Child class acquiring the properties
of Parent class is called Inheritance.

Method Overriding means acquiring the method
from parent class & modifying it in the
child class.

 */