package JavaConcepts;

public class staticKeyword {

      int x = 6;
      static int s = 2;

      public void a(){
          System.out.println("void a");
      }

      public static void b(){
          System.out.println("static void b");
      }

      static {
          System.out.println("static block");
      }

      static{
          System.out.println("static block2");
      }
    public static void main(String[] args) {
       staticKeyword sk = new staticKeyword();
        System.out.println(sk.x);
        sk.x++;
        sk.s++;
        sk.a();
        staticKeyword sk2 =  new staticKeyword();
        System.out.println(sk2.x);
        System.out.println(sk2.s);
        sk2.a();
        staticKeyword.b();
        System.out.println(staticKeyword.s);
        methods.e();
        methods m = new methods();
        m.vote();
      }

}

/*
static - used for variables, methods & blocks.
 */