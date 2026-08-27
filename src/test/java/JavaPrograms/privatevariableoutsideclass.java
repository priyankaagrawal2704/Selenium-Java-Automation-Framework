package JavaPrograms;

class student
{
    private int age=25;
    public int getage(){
        return age;
    }
}
public class privatevariableoutsideclass {

    public static void main(String[] args) {
        student s=new student();
        System.out.print(s.getage()) ;

    }





}
