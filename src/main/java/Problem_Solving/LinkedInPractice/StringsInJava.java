//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Problem_Solving.LinkedInPractice;

public class StringsInJava {

    public static void main(String[] args) {
        String s1 = "Suyog";
        String s2 = "Suyog";
        s2 = s2.concat("Badjate");
        System.out.println(s2);
        s2 = s2.replace("Badjate", "");
        String s3 = new String("Sushil");
        System.out.println();
        System.out.println("equals and equalsIgnoreCase");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println();
        s2 = "Suyog";
        System.out.println("Comparator(==)");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println();
        System.out.println("compareTo()");
        System.out.println(s1.compareTo(s2));
        s2 = "Soniwal";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s3));
        System.out.println();
        System.out.println("Concatenation");
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s3));
        System.out.println();
        System.out.println("StringBuilder");
        StringBuilder sb = new StringBuilder();
        new StringBuilder(20);
        StringBuilder sb2 = new StringBuilder("Java");
        System.out.println(sb.append("Java"));
        System.out.println(sb2.insert(1, "i"));
        System.out.println(sb2);
        System.out.println(sb2.replace(1, 3, "av"));
        System.out.println("sb: " + sb);
        System.out.println(sb.delete(1, 2));
        System.out.println(sb.reverse());
    }
}
