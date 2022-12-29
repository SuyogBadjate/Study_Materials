package Telusko_Java_tutorials;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializeDemo1 {
    public static void main(String[] args){
        try{
        Student5 st1=new Student5();
        st1.setRollno(101);
        st1.setSname("Mangesh");

        Student5 st2=new Student5();
        st2.setRollno(102);
        st2.setSname("Shiny");

        List<Student5> s=new ArrayList<>();
        s.add(st1);
        s.add(st2);

        College c=new College();
        c.setStudents(s);

        XMLEncoder x=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
        x.writeObject(c);
        x.close();
    }catch(FileNotFoundException e){
            System.out.println(e);
        }
}}
class College implements Serializable{

    private List<Student5> students;

    public List<Student5> getStudents() {
        return students;
    }

    public void setStudents(List<Student5> students) {
        this.students = students;
    }
}
class Student5 implements Serializable {
    private int rollno;
    private String sname;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student5{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                '}';
    }
}
