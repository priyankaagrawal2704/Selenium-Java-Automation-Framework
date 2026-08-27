package TestNG;

import org.testng.annotations.Test;

public class groups {

    @Test(groups="Smoke")
    public void a(){
        System.out.println("void a");
    }

    @Test(groups="Regression")
    public void b(){
        System.out.println("void b");
    }

    @Test(groups={"Smoke","Regression"})
    public void c(){
        System.out.println("Void c");
    }
}
