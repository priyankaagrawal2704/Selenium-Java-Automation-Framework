package JavaConcepts;

public class strings2 {
    public static void main(String[] args) {
        StringBuilder sbl = new StringBuilder("Hello");
        StringBuffer sbf = new StringBuffer("World!!");

        System.out.println(sbl.hashCode());

        System.out.println(sbl.append(" Hi"));
        System.out.println(sbl.hashCode());

        System.out.println(sbl.length());
        System.out.println(sbl.reverse());
        System.out.println(sbl.charAt(4));
        System.out.println(sbl.delete(2,5));
        System.out.println(sbl.deleteCharAt(2));
        System.out.println(sbl.replace(1,2,"xyz"));
        System.out.println(sbl.insert(1,"xyz"));

        System.out.println(sbl.toString());
    }
}
