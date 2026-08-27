package JavaPrograms;

public class StringNoOfa {

    public static void noofA(String s)
    {
        char[] ch=s.toCharArray();
        int count=0;
        for(char c:ch)
        {
            if(c=='a')
            {
                count++;
            }
        }
        System.out.print("No of A:"+count);
    }

    public static void main(String[] args) {
        noofA("Hyderabad");
    }
}
