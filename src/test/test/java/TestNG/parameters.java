package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {

    @Parameters({"param1","param2"}) //can be used with Before annotations also
    @Test
    public void sample(String s1, String s2){
        System.out.println(s1+" "+s2);
    }
}

/*
mvn test -DsuiteFile="parameters" -Dparam1="nit745am" -Dparam2="17Aug2026"
 */
