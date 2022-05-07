
import java.sql.*;
import java.util.Scanner;

public class SQLAssign {

    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        //System.out.println("Driver loaded");
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter username : ");
        String username = ob.next();
        System.out.println("Enter password : ");
        String password = ob.next();
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", username, password);
        System.out.println("Connection Done!");
        Statement stmt = conn.createStatement();
        System.out.println("Enter query : ");
        String sql = ob.next();
        stmt.executeUpdate(sql);
        System.out.println("Record Inserted");
        conn.close();
    }
}
