package JavaConcepts;

public class strings1 {

    public static void main(String[] args) {
        String s = new String("Hello World!!!");
        String x = "Hello World !!!";

        System.out.println(s.hashCode());
        //Strings are immutable
        s = s.toLowerCase();
        System.out.println(s.hashCode());

        s = s.toUpperCase();
        System.out.println(s.hashCode());
        String a = x.toUpperCase();
        System.out.println(a);
        System.out.println(x.toLowerCase());
        int i = x.length();
        char ch = s.charAt(2);
        boolean b = x.startsWith("he");
        System.out.println(x.endsWith("!!"));
        x.equals("Hello World");
        System.out.println(x.equalsIgnoreCase("hello WORld!!!"));
        System.out.println(x.concat(" 12345"));
        System.out.println(x.replace("!!!","xxxxxx"));
        System.out.println(x.substring(5,9));
        System.out.println(x.substring(6));
        System.out.println(" H i ".trim().length());

        String j = "125";
        System.out.println(j+5);
        int jj = Integer.parseInt(j);
        float kk = Float.parseFloat(j);
        System.out.println(jj+5);

        char[] chh = x.toCharArray();
        for(char c:chh){
            System.out.println(c);
        }

        String[] xx = x.split(" "); //splits at every whitespace
//        x.split(","); //splits at every comma
//        x.split("BAD"); //splits at every "BAD"
//        x.split("I"); //splits at every "I"
        for(String ii:xx){
            System.out.println(ii);
        }
    }

}
