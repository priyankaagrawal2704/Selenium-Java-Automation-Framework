package JavaConcepts;

class dataTypes{

    public static void main(String[] args){
        /*
        Primitive Data Types: Integers, Decimals, Characters & Boolean.
        Non-Primitive Data Types: Class, Interface, Strings & Arrays.

        Integers:
        byte: Size is 2 power 8.
        -128 to -1 & 0 to 127.

        short: Size is 2 power 16.
        -32768 to -1 & 0 to 32767.

        int: Size is 2 power 32.

        long: Size is 2 power 64.

        Decimals:
        float - 2 power 32.
        double - 2 power 64.

        Characters:
        char - 2 power 16. (Unicode)
        A Character is a single quote & single letter value.

        Boolean - true or false.

         */

        //<dataType> <variableName> = <value>;

        byte b = 12;
        short ss = b; //widening
        short sss = 150;
        byte bb = (byte)sss; //narrowing
        short s = 4235;
        int i = 1252346;
        long l = 146257678;

        byte x; //Declaration
        x = 3; //Initialisation
        x=4; //update

        char ch = 'a';
        char ch1 = 97;

        float a = 1.2345f;
        double d = 0.987654;

        boolean bool = true;

        System.out.println(b);
        System.out.println('b'); //char
        System.out.println("b"); //String

        System.out.println(b+s);

        System.out.println(b+'a');
        System.out.println('a'+'b');
        System.out.println('a'+"b");
        System.out.println(('a'+'b')+"c");
        System.out.println("a"+b);
        System.out.println('a'+"b"+'c');
        System.out.println('a'+b+'c');
        methods m = new methods();
        m.vote();
    }

}
