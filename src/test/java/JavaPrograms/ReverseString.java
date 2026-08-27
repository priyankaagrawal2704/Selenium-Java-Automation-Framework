package JavaPrograms;

public class ReverseString {
    public static void Stringrev(String s){

        char[] ch=s.toCharArray();
        int i=ch.length-1;
        while(i>=0)
        {
            System.out.print(ch[i]);
            i--;
        }
    }

    public static void main(String[] args) {
        Stringrev("Priyanka");
    }
}

