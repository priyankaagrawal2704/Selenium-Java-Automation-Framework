package JavaPrograms;

public class NoofVowels {

    public static void vowelscount(String s)
    {

        int count=0;
        char[] ch= s.toLowerCase().toCharArray();
        for(char c:ch){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
             count++;

            }
        }
        System.out.println("No of Vowels:"+ count);
    }


    public static void main(String[] args) {
        vowelscount("Priyanka");
    }



}
