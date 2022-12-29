package Telusko_Java_tutorials;

import java.io.*;
import java.util.Properties;

public class PropertiesFileDemo {
    public static void main(String[] args) throws Exception{
        Properties p =new Properties();

        InputStream is=new FileInputStream("dataConfig.properties");
        p.load(is);

        p.list(System.out);
        System.out.println("uname");

    }
}
