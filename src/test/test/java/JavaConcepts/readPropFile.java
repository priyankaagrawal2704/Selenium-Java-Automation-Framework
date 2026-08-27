package JavaConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readPropFile {
    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\JavaConcepts\\sample.properties";
        File file = new File(filePath);
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.lastModified()); //epoch time
        System.out.println(file.isHidden());
        System.out.println(file.canRead());
//        System.out.println(file.delete());
        System.out.println(file.getName());
//        try {
            FileInputStream fis = new FileInputStream(file);
//        }
//        catch(Exception e){}
//        System.out.println("hi");
        Properties prop = new Properties();
        prop.load(fis);
        String name = prop.getProperty("name"); //retrieve the "name" value
        String age = prop.getProperty("age");
        String gender = prop.getProperty("gender");
        System.out.println(name+" "+age+" "+gender);
    }
}
