package Telusko_Java_tutorials;
import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/customer_db";
        String uname="root";
        String pass="110698";
        //String query = "insert into customer values(8,\"java@gmail.com\",\"Java\",Date(\"2000-11-10\"))";
        String query = "insert into customer values(?,?,?,?)";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        //Statement st = con.createStatement();
        PreparedStatement st=con.prepareStatement(query);
        st.setInt(1,9);
        st.setString(2,"Python@gmail.com");
        st.setString(3,"Python");
        st.setDate(4,Date.valueOf("1998-11-5"));
        int count = st.executeUpdate();
        String userData;
//        while (rs.next()) {
//            userData = rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3) + ":" + rs.getDate(4);
//            System.out.println(userData);
//        }
        System.out.println(count+" row/s affected");
        st.close();
        con.close();

    }


}
