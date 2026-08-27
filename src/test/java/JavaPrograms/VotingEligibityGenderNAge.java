package JavaPrograms;



public class VotingEligibityGenderNAge {

    public static void main(String[] args){
      char gender='M';

      int maleage=18,femaleage=20;

      if(gender =='F') {
          if (femaleage >= 18) {
              System.out.println("Female Eligible to vote");
          } else {
              System.out.println("Male Not eligible to vote");
          }
      }

      else if(gender =='M') {
          if (maleage >= 18) {
              System.out.println("Male Eligible to vote");
          } else {
              System.out.println("Male Not eligible to vote");
          }
      }



    }



}
