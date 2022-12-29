package Telusko_Java_tutorials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
         List<Student6> st=new ArrayList<>();
         st.add(new Student6(1,55));
        st.add(new Student6(2,95));
        st.add(new Student6(3,85));
        st.add(new Student6(4,45));
        st.add(new Student6(5,85));

//        Collections.sort(st,(s1,s2)->{
//            return s1.marks<s2.marks?1:-1;
//        });
        Collections.sort(st);
        for (Student6 s:st) {
            System.out.println(s);
        }

    }
}
class Student6 implements Comparable<Student6>{
    int rollno;
    int marks;

    public Student6(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student6{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student6 o) {
        return this.marks<o.marks?1:-1;
    }
}
