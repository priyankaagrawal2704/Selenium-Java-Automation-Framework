package JavaPrograms;

public class StringPractice {

    public static void main(String[] args) {
        String s="Helllo world";
        s=s.toUpperCase();
        System.out.println(s);
       //System.out.println(s.hashCode());
       s= (s.concat("India"));
        System.out.println(s);
        System.out.println(s.substring(5,6));
        System.out.println(s.trim());
        System.out.println(s.replace("India","Australia"));

        String x="I am learning java";

       /* String[] xx=x.split(" " );*/
        String[] xx=x.split("I");

        for(String ii:xx)
        {
            System.out.print(ii);
        }


    }

}

