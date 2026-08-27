package JavaConcepts;

interface sampleInterface{
    int i = 5;
/*
All the interface variables are public static final
by definition
 */
    public abstract void a();
    /*
    All the interface methods are public abstract
    by definition
     */
}

interface sampleInterface2{
    int x = 5;
}

public class interfacesConcept implements sampleInterface, sampleInterface2 { //mutliple inheritance
    public void a(){
        System.out.println("void a");
    }

    public static void main(String[] args) {
//        sampleInterface si = new sampleInterface();
        //we cannot create object for an interface
        System.out.println(sampleInterface.i);
        System.out.println(sampleInterface2.x);
    }
}

/*
class extends class
interface extends interface
class implements interface
 */