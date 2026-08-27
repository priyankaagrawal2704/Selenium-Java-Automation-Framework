package JavaConcepts;

public class string1 {
    public static void main(String[] args)
    {
        String s = "Hyderabad";
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a')
            {
                count++;
            }
        }
        System.out.println("Number of a is : " + count);
    }
}