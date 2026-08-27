package JavaConcepts;

public class methodOverloading {

    public void a(){
        System.out.println("Void a");
    }

    void a(int x){
        System.out.println("void with int param");
    }

    void a(char y){
        System.out.println("void with char param");
    }

    void a(float z){
        System.out.println("void with float param");
    }

    float a(int x, float y){
       return x+y;
    }

    public static void main(String[] args) {
        methodOverloading mo = new methodOverloading();
        mo.a();
        mo.a('a');
        String s = new String("Hi");
    }
}

/*
Method Overloading is when we have multiple
methods of the same name but with different
parameters in the same class.

Method Overloading is not dependent on
return types.
 */
