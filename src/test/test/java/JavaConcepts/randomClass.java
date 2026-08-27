package JavaConcepts;

import java.util.Random;

public class randomClass {

    public static void main(String[] args) {
        Random ran = new Random();
        int x = ran.nextInt();
        System.out.println(x);
        boolean b = ran.nextBoolean();
    }
}
