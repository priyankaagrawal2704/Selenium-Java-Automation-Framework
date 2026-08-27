package JavaConcepts.subPack;

public class breakContinue extends inheritance3{

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            if(i==3){
                System.out.println("Break");
                break; //exits the loop
            }
            System.out.println(i);
        }
        System.out.println("=======");
        for(int i=0;i<5;i++){
            if(i==3){
                System.out.println("Continue");
                continue; //skips the iteration
            }
            System.out.println(i);
        }
        accessModifiers am = new accessModifiers();
        am.defaultMethod();

        inheritance3 i3 = new inheritance3();
//        i3.a();
        breakContinue bc = new breakContinue();
        bc.a();
    }
}
