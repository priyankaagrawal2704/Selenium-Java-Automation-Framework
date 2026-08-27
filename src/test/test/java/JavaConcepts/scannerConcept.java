package JavaConcepts;

import java.util.Scanner;

public class scannerConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.next(); //stores all the input until the first whitespace
        String s = sc.nextLine(); //captures the entire line
        System.out.println(s);
    }
}
