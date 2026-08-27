package JavaPrograms;

/*public class RemoveSpace {
    public static void main(String[] args) {
        String s="I love java";
        String result=s.replace(" ","");
        System.out.print(result);
    }
}*/

public class RemoveSpace{
    public static void main(String[] args) {
        String s="I Love Java";
        String result="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                result=result+s.charAt(i);

            }
        }
        System.out.print(result);
    }
}



