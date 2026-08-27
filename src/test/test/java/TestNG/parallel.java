package TestNG;

import org.testng.annotations.Test;

public class parallel {

    @Test
    public void a() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void a");
    }

    @Test
    public void b() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void b");
    }

    @Test
    public void c() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void c");
    }

    @Test
    public void d() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void d");
    }

    @Test
    public void e() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void e");
    }

    @Test
    public void f() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void f");
    }

    @Test
    public void g() throws Exception{
        Thread.sleep(5000);
        System.out.println("Void g");
    }
}
/*
ThreadLocal
 */