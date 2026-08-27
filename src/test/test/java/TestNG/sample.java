package TestNG;

import org.testng.annotations.Test;

public class sample {
    @Test
    public void testCase(){
        System.out.println("Hello World!!!");
        sample s = new sample();
        s.simple();
    }

    public void simple(){
        System.out.println("Simple");
    }
}
