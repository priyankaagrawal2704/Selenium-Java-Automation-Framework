package JavaPrograms;

public class SumNumber
{
    public static void sum(String s)
    {
       char[] ch= s.toCharArray();
       int sum=0;
       for(char c:ch)
       {
           if(c>='0' && c<='9')
           {
               sum=sum+(c-'0');
           }
       }
       System.out.println("Sum= "+sum);
    }


    public static void main(String[] args) {
        sum("1DEr4B4D");
    }

}
