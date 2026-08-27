package TestNG;

import org.testng.annotations.Test;

public class classes {
    @Test(groups="Smoke")
    public void a(){
        System.out.println("void a()");
    }

    @Test
    public void b(){
        System.out.println("Void b()");
    }
}
