package Telusko_Java_tutorials;

import java.sql.*;

public class JDBCDemo1 {
    public static void main(String[] args) {
        StudentDAO dao=new StudentDAO();
        //Student8 s1=dao.getStudent(15);
        Student8 s2=new Student8();
        s2.rollno=17;
        s2.sname="Manav";
        dao.connect();
        dao.addStudent(s2);


//        System.out.println(s1.sname);
    }
}
class StudentDAO{
    Connection con=null;
    public void connect(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/customer_db", "root", "110698");
    } catch(Exception e){
        System.out.println(e);
    }
    }
    public Student8 getStudent(int rollno) {

        try {
            String query = "select sname from student where rollno=" + rollno;
            Student8 s = new Student8();
            s.rollno = rollno;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getString(1);
            s.sname = name;
            return s;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public void addStudent(Student8 s){
        String query="insert into Student values (?,?)";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(query);
            pst.setInt(1,s.rollno);
            pst.setString(2,s.sname);
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Student8{
    int rollno;
    String sname;
}
