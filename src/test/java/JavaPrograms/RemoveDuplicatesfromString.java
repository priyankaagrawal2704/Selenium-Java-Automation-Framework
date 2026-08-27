package JavaPrograms;

public class RemoveDuplicatesfromString {
    public static void main(String[] args) {
        String s = "Programming";

        for(int i=0;i<s.length();i++)
        {
            boolean flag=false;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                System.out.print(s.charAt(i));
            }
        }

    }


}
