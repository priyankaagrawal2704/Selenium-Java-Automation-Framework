package JavaConcepts.subPack;

class simple{
    private int i = 5;

    private void a(){
        System.out.println("Void a");
    }

//    public void publicMethod(){
//        System.out.println("Public method");
//    }
}

public class accessModifiers {
    int j = 6;

    void defaultMethod(){
        System.out.println("Default Method");
    }

    public void publicMethod(){
        System.out.println("Public method");
    }
    public static void main(String[] args) {
        accessModifiers am = new accessModifiers();
        System.out.println(am.j);
        simple s = new simple();
//        System.out.println(s.i);
//        s.a();
//        s.publicMethod();
        am.publicMethod();
    }

}

/*
Encapsulation:
public, private, default & protected

private - Property cant be called outside the class.


These are used with variables, methods
& constructors.
 */