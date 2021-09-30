package myapp.loginfx;

import java.sql.*;

public class Javapsql {
    public static void write(String _username, String _password) throws ClassNotFoundException, SQLException {
        String query = String.format("INSERT INTO persons(username,password) VALUES('%s','%s')",_username,_password);

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javalogin","postgres","Mathankumar@14");
        Statement st = con.createStatement();
        st.executeUpdate(query);

    }


}
