package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL driver in class for name
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_management_system", "root", "tech_sahil"); // use local host pot  3306
            s = c.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found. Include it in your library path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (s != null) s.close();
            if (c != null) c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Conn conn = new Conn();
        // Use the connection here
        conn.close(); // Always close the connection
    }
}
