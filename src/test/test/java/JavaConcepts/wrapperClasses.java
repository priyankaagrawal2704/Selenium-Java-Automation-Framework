package JavaConcepts;

public class wrapperClasses {
    public static void main(String[] args) {
        int i = 4; //primitive
        Integer x = 5; //Object. Conversion is called Auto Boxing
        /*
        byte - Byte
        short -  Short
        int - Integer
        long - Long

        float - Float
        double - Double

        char - Character

        boolean - Boolean
         */
        int y = Integer.valueOf(x); //Converting to Primitive. Called as Unboxing.
    }
}
