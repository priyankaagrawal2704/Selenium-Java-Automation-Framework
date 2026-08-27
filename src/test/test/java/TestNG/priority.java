package TestNG;

import org.testng.annotations.Test;

public class priority {
    @Test(priority=4)
    public void a() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void a");
    }

    @Test(priority = 0)
    public void b() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void b");
    }

    @Test(priority = -1)
    public void c() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void c");
    }

    @Test(priority = 2)
    public void d() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void d");
    }

    @Test(priority = 1)
    public void e() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void e");
    }

    @Test
    public void f() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void f");
    }

    @Test(priority = 1)
    public void g() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void g");
    }
}
