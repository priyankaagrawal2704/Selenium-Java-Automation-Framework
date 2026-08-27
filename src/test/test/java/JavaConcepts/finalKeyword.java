package JavaConcepts;

final class fk2{
    int x = 5;
}

class fk1{
    public void a(){
        System.out.println("void a");
    }

    public final void b(){
        System.out.println("final method");
    }
}

public class finalKeyword extends fk1{
    int i = 4;
    final int j = 3; //constant

    public void a(){
        System.out.println("overriding");
    }

//    public void b(){}

    public static void main(String[] args) {
        finalKeyword fk = new finalKeyword();
        fk.i++;
//        fk.j++;
        fk.a();
    }
}
/*
final class - cannot be inherited
final variable - cannot be updated (constant)
final method - cannot be overridden
 */