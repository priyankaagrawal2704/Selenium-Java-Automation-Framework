package JavaPrograms;

public class DivisibilityCheck {
    public static void main(String[] args) {
        int n=11;

        if(n%3==0)
        {
            System.out.print(3);
        }
        if(n%5==0)
        {
          System.out.print(5);
        }
        if(n%7==0){
            System.out.print(7);
        }
        if(n%3!=0 && n%5!=0 && n%7!=0){
            System.out.print(n);
        }

        }
    }

