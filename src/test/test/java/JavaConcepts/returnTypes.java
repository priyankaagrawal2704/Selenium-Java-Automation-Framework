package JavaConcepts;

public class returnTypes {

//    void a(){}

    int sampleMethod(){
        System.out.println(5);
        return 2;
    }

    int method2(int i){
        return i+5;
    }

    float method3(int x, float y){
        return x+y;
    }

    int method4(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        returnTypes rt = new returnTypes();
        int x = rt.sampleMethod();
        System.out.println(x);
        int y = rt.method2(5);
//        System.out.println(rt.i);
    }

}
