package JavaPrograms;

public class ConverttoUppercase {
    public static void uppercase(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32);
            }
            System.out.println(ch);
        }

    }

    public static void main(String[] args) {
        uppercase("Nareshit");
    }
}



