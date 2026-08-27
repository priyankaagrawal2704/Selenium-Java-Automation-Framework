package TestNG;

import org.testng.annotations.Test;

public class testAnnotation {
    @Test(invocationCount = 5)
    public void a(){
        System.out.println("void a");
    }

    @Test(timeOut=5000)
    public void b() throws Exception{
        Thread.sleep(5500);
        System.out.println("void b");
    }

    @Test(dependsOnMethods = "b", alwaysRun = true)
    public void c(){
        System.out.println("void c");
    }

    @Test(enabled = false)
    public void d(){
        System.out.println("void d");
    }
}
