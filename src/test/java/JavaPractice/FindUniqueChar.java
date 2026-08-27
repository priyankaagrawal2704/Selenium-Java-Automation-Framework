package JavaPractice;

public class FindUniqueChar {
    public static void main(String[] args) {
        String s1="pqr";
        String s2="rqps";

        for(int i=0;i<s2.length();i++) {
            boolean found = false;
            for (int j = 0; j < s1.length(); j++) {
                if (s2.charAt(i) == s1.charAt(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(s2.charAt(i));

            }
        }
    }
}
