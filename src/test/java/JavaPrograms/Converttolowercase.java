package JavaPrograms;

public class Converttolowercase {

    public static void lowercase(String s)
    {
         char[] ch= s.toCharArray();
         for(char c:ch)
         {
             if(c>='A'&& c<='Z')
             {
                 c= (char)(c+32);

             }
             System.out.print(c);
         }
    }

    public static void main(String[] args) {
        lowercase("NareshIT");
    }

}