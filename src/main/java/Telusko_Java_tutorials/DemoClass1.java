package Telusko_Java_tutorials;

import java.sql.DriverManager;

public class DemoClass1 {
    public static void main(String[] args) throws Exception{
       Class.forName("com.mysql.jdbc.Driver");
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    }
}
class demoForName{
    static {
        System.out.println("in static");
    }
    //instance
    {
        System.out.println("instance");
    }
}