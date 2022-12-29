package Telusko_Java_tutorials;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {
    public static void main(String[] args) {
        String lang="en";
        String country="US";

        Locale l=new Locale(lang,country);
        ResourceBundle r = ResourceBundle.getBundle("Telusko_Java_tutorials/Bundle",l);

        String str=r.getString("wish");
        System.out.println(str);
    }
}
