package JavaPrograms;

public  class Voteeligiblebymethod {

    public static void checkvote(int age){
         if(age>=18){
             System.out.print("Eligible to vote");

         }
         else{
             System.out.print("Not Eligible to vote");
         }
    }


public static void main(String[] args) {

    Voteeligiblebymethod m= new Voteeligiblebymethod();
    m.checkvote(14);

}

}